package test;

public class test {
	public int age;
	public String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "test [age=" + age + ", name=" + name + "]";
	}
	

}