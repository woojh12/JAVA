package ex.ex01;

public class Student extends Person{
//	private String name;
//	private String birthday;
	private String school;
	
//	public Student()
//	{
//		// super();	// new Person();
//		//super("aaa", "1234");
//		System.out.println("Student 객체 생성");
//	}
	
	public Student(String name, String birthday, String school)
	{
//		this.name = name;	// 부모클래스(Person Class)에서 매개변수 타입이 protected인 경우 가능
//		this.birthday = birthday;
		super(name, birthday);
		this.school = school;
	}
	
	// 어노테이션
	@Override
	public void printInfo()
	{
		super.printInfo(); 		// 부모클래스의 printInfo()함수 호출
		System.out.println(" 학교 : " + school);
		//System.out.println("이름 : " + name + " 생년월일 : " + birthday + " 학교 : " + school);
	}
}
