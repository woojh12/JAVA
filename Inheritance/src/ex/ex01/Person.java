package ex.ex01;

public class Person {
	// protected : 자식 클래스 까지만 접근허용
//	protected String name;
//	protected String birthday;
	
	private String name;
	private String birthday;
	
//	public Person()
//	{
//		System.out.println("Person 객체 생성");
//	}
	
	public Person(String name, String birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}
	
	public void printInfo()
	{
		System.out.println("이름 : " + name + " 생년월일 : " + birthday);
	}
}
