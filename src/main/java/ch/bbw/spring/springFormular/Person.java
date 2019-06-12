package ch.bbw.spring.springFormular;

public class Person {

	private String name;
	private int age;
	private double grade;

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

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

}
