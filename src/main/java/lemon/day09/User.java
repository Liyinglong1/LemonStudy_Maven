package lemon.day09;

public class User {
	private String name;
	private String age;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public User(String name, String age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
