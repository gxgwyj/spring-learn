package gaoxugang.apt;

import gaoxugang.annotation.Constraints;
import gaoxugang.annotation.DBTable;
import gaoxugang.annotation.SQLInteger;
import gaoxugang.annotation.SQLString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 注解处理器
 */
public class TableCreator {
	public static void creator(String[] classNames) throws Exception{
		for (String name:classNames){
			Class<?> clazz = Class.forName(name);
			DBTable dbTable = clazz.getAnnotation(DBTable.class);
			if (dbTable == null){
				System.out.println("No DBTable annotations in class " + name);
				continue;
			}

			String tableName = dbTable.name();

			if(tableName.length()<1){
				tableName = clazz.getName().toUpperCase();
			}

			List<String> columnDefs = new ArrayList<String>();

			for (Field field:clazz.getDeclaredFields()){
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				//字段不存在注解
				if (anns.length<1){
					continue;
				}

				//整型字段
				if (anns[0] instanceof SQLInteger){
					SQLInteger sInt = (SQLInteger) anns[0];

					if (sInt.name().length()<1){
						columnName = field.getName().toUpperCase();
					}else{
						columnName = sInt.name();
					}
					columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()) );
				}

				//字符串型字段
				if (anns[0] instanceof SQLString){
					SQLString sString = (SQLString) anns[0];

					if (sString.name().length()<1){
						columnName = field.getName().toUpperCase();
					}else{
						columnName = sString.name();
					}
					columnDefs.add(columnName + " VARCHAR(" + sString.value()+")" + getConstraints(sString.constraints()) );
				}
			}

			StringBuilder  createCommand = new StringBuilder("CREATE TABLE " + tableName +"(");
			for (String columnDef:columnDefs){
				createCommand.append("\n   " + columnDef + ",");
			}
			String tableCreate = createCommand.substring(0,createCommand.length()-1) + ");";
			System.out.println("Table Creation SQL for " + name + " is :\n" +tableCreate);
		}
	}

	private static String getConstraints(Constraints con){
		String constraints = "";
		if (!con.allowNull())
			constraints += " NOT NULL";
		if (con.primaryKey())
			constraints += " PRIMARY KEY";
		if (con.unique())
			constraints += " UNIQUE";

		return constraints;
	}


	public static void main(String[] args) throws Exception{
		String[] clazzs = {"gaoxugang.pojo.Member"};
		creator(clazzs);
	}
}
