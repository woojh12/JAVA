package test.test02;

public class Shape {
	// 도형 이름
	protected String name;
	
	public double CalculateArea()
	{
		// nothing
		return 0;
	}
	
	public void PrintArea()
	{
		//nothing
		System.out.println(name + "의 넓이는 "  + CalculateArea() + "cm^2 입니다.");
	}
}
