package ex.ex01;

public class Ex01 {
	public static void main(String[] args) {
//		Animal animal = new Animal();	// -> 자체 객체 생성 안됨
		
		Dog dog = new Dog();
		dog.cry();
		dog.eat();
		
		Cat cat = new Cat();
		cat.cry();
		cat.grooming();
		
		Animal animal = dog;		// upcasting 가능
		animal.cry();
//		animal.lash();				// 부모 클래스에서 생성된 함수 아니면 호출 x
		
	}
}
