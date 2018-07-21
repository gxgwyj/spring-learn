package gaoxugang.pojo;


import gaoxugang.annotation.Constraints;
import gaoxugang.annotation.DBTable;
import gaoxugang.annotation.SQLInteger;
import gaoxugang.annotation.SQLString;

@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30)
	private String firstName;

	@SQLString(50)
	private String lastName;

	@SQLInteger
	private Integer age;

	@SQLString(value = 30,constraints = @Constraints(primaryKey = true))
	private String handle;


	private static int memberCount;


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getHandle() {
		return handle;
	}
	public String toString(){
		return handle;
	}
}
