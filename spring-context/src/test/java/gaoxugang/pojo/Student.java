package gaoxugang.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Student implements Serializable{
	private String name;
	private String email;

	public void study() {
		System.out.println("学习课本");
	}

	@Autowired
	private Teacher teacher;

	public Student() {
		System.out.println("Student init");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
