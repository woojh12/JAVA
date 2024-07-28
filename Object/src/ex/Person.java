package ex;

public class Person {		// extends Object }			<--- 기본적으로 모든 클래스는 오브젝트 클래스를 상속하고있음.
	// 이름, 나이
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void printInfo()
	{
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
	@Override
	public String toString()
	{
		return "이름 : " + name + " 나이 : " + age;
	}
}
