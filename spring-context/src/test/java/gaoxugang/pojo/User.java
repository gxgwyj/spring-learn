package gaoxugang.pojo;

/**
 * Created by Administrator on 2017/10/27.
 */
public class User {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		System.out.println("User Create");
	}
}
