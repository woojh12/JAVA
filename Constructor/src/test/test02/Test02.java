package test.test02;

public class Test02 {
	public static void main(String[] args) {
		Student student = new Student("abc", "낙성대학교", "010-0000-1111","Java");
		
		student.printInfo();
		student.setSchool("첨성대학교");
		student.printInfo();	
		student.printSchoolMessage();
		student.printMessage("잘하자");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Galaxy galaxy = new Galaxy("삼성", "gallaxy", "1234567890", "010-111-2222");
		
		galaxy.printInfo();
	
		galaxy.calling("010-0000-9999");
		
		galaxy.message("000-1234-5678", "자니 ?");
	}
}

