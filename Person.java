package btvn1;

public class Person {
	private String name;
	private int age;
	private int sdt;
	private String email;
	private int id;
	public Person(String name, int age, int sdt, String email, int id) {
		this.name = name;
		this.age = age;
		this.sdt = sdt;
		this.email = email;
		this.id = id;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sdt=" + sdt + ", email=" + email + ", id=" + id + "]";
	}
	
}
