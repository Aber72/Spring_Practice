package springcnstrargs;

public class Person {
	
	private String name;
	private int age;
	private Credit cd;
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
	}
	public Credit getCd() {
		return cd;
	}
	public void setCd(Credit cd) {
		this.cd = cd;
	}
	public Person(String name, int age, Credit cd) {
		super();
		this.name = name;
		this.age = age;
		this.cd = cd;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ",cd ="+cd+"]";
	}

}
