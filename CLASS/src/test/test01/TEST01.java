package test.test01;

public class TEST01 {
	public static void main(String[] args) {
		
		// 1. 핸드폰 객체
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		phone1.str = "samsung";
		phone1.modelID = "갤럭시ZFlip3";
		phone1.phonenum = "010-1234-5678";
		
		phone2.str = "apple";
		phone2.modelID = "iphone16";
		phone2.phonenum = "010-9876-5432";
		
		System.out.println(phone1.modelID + " " + "(" +
		phone1.str + ") : " + phone1.phonenum);
		
		System.out.println(phone2.modelID + " " + "(" +
		phone2.str + ") : " + phone2.phonenum);
		
		System.out.println();
		
		// 2. 학생 명단
		Student student[] = new Student[2];
				
		for(int i = 0; i < student.length; i++)
		{
			student[i] = new Student();
		}
		
		student[0].name = "유재석";
		student[0].className = "java";
		student[0].phoneNum = "010-0000-1111";
		student[0].age = 21;
		
		student[1].name = "이효리";
		student[1].className = "웹 개발";
		student[1].phoneNum = "010-9999-2222";
		student[1].age = 23;
		
		for(int i = 0; i < student.length; i++)
		{
			System.out.println(student[i].name + " (" + 
			student[i].age + ") 수업 : " + student[i].className 
			+ "," + " 연락처 : " + student[i].phoneNum);
		}
	}
}
