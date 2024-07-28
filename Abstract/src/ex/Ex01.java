package ex;

public class Ex01 {
	public static void main(String[] args) {
//		new Animal();	// 추상 클래스는 객체 생성이 불가능하다.
		
		Dog dog = new Dog();

		dog.cry();
		
		dog.lash();
		
		Animal animal = dog;
		animal.eat();
		animal.cry();
//		animal.lash();		
	}
}
