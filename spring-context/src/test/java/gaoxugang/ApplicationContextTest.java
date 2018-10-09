package gaoxugang;

import gaoxugang.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/18.
 */
public class ApplicationContextTest {

	@Test
	public  void testApplication() {
		String[] locations = {"gaoxugang/annotation-based.xml","gaoxugang/context-simple.xml"};
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(locations);
		Student bean = ctx.getBean(Student.class);
		System.out.println(bean.toString());
	}

}
