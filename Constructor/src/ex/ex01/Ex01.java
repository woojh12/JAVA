package ex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		Person me = new Person("qqqq", "12341234");
//		me.name = "12341234";
//		me.birthday = "qqqqq";
		
		me.printInfo();
		
		// 개명
		// 객체나 멤버 변수 값 수정
		// me.name = "aaaaa";
		
		me.setName("aaaaa");
		
		me.printInfo();
		
		// 생년월일 출력
		System.out.println(me.getBirthday());
	}
}
