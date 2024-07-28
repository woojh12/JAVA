package test.test02;

public class Student {
	private String name;
	private String school;
	private String phone;
	private String study;
	
	public Student(String name, String school, String phone, String study)
	{
		this.name = name;
		this.school = school;
		this.phone = phone;
		this.study = study;
	}
	
	public void setSchool(String school)
	{
		this.school = school;
		System.out.println(name + "님의 학교가 " + school + "로 변경되었습니다.");
	}
	
	public void printSchoolMessage()
	{
		System.out.println(name + "학생에게 " + "("+ phone + ") " +"수업일정 메시지를 전송 합니다.");
	}
	
	public void printMessage(String type)
	{
		System.out.println(name + "학생에게 " + "("+ phone + ") " + type + " 라고 전송 합니다.");
	}
	
	public void printInfo()
	{
		System.out.println(study + " 수업 : " + school + " " + name + "학생");
	}
}
