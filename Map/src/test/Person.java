package test;

public class Person {
	private String name;
	private int birth;
	
	public Person(String name, int birth)
	{
		this.name = name;
		this.birth = birth;
	}
	
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return "이름 : " + name + " 생년월일 : " + birth;
	}
}
