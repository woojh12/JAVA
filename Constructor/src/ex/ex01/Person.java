package ex.ex01;

public class Person {
	
	// 이름, 생년월일
	private String name;
	private String birthday;
	
	// 기본 생성자 : 파라미터 없는 생성자
	public Person()
	{
		System.out.println("생성!");
	}
	
	public Person(String name, String birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}
	
	// name 값 수정 기능
	// setter
	public void setName(String name)
	{
		this.name = name;
	}	
	
	// 생년월일 값 리턴
	// getter
	public String getBirthday()
	{
		return birthday;
	}
	
	// 정보 출력
	public void printInfo()
	{
		System.out.println("이름 : " + this.name);
		System.out.println("생일 : " + this.birthday);
		
//						or
		
//		System.out.println("이름 : " + name);
//		System.out.println("생일 : " + birthday);
	}
}
