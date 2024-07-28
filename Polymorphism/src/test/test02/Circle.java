package test.test02;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius)
	{
		this.name = "원";
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return "반지름 : " + radius;
	}
	
	// 넓이를 구하는 기능
	@Override
	public double CalculateArea()
	{
		return radius * radius * 3.14;
	}
	
	// 넓이를 출력하는 기능
//	@Override
//	public void PrintArea()
//	{
//		System.out.println("원의 넓이는 "  + CalculateArea() + "cm^2 입니다.");
//	}
}
