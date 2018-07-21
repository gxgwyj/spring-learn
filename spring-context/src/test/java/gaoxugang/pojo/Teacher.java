package gaoxugang.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/26.
 */
public class Teacher implements Serializable{
	private static final long serialVersionUID = 2155778974686916699L;
	private String name;

	public Teacher() {
		System.out.println("Teacher init");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
