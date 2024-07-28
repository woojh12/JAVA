package test.test01;

public class Test01 {
	public static void main(String[] args) {
		// 업캐스팅
		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Dog();
		
		for(int i = 0; i < 3; i++)
		{
			animals[0].cry();
		}
		for(int i = 0; i < 3; i++)
		{
			animals[1].cry();
		}
		

		animals[0].grooming();
		animals[1].lash();
		
		
		System.out.println("========================");
		// 다운캐스팅
		Cat cat = (Cat)animals[0];
		Dog dog = (Dog)animals[1];
		
		for(int i = 0; i < 3; i++)
		{
			cat.cry();
		}
		for(int i = 0; i < 3; i++)
		{
			dog.cry();
		}
		
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] instanceof Dog)
			{
				Dog dog1 = (Dog)animals[i];
				dog1.lash();
			}
			else if(animals[i] instanceof Cat)
			{
				Cat cat1 = (Cat)animals[i];
				cat1.grooming();
			}
		}
//		------------------------ OR -------------------------------
//		cat.grooming();
//		dog.lash();
	}
}
