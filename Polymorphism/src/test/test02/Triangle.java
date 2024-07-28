package test.test02;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle(int width, int height)
	{
		this.name = "삼각형";
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString()
	{
		return "밑변 : " + width + "높이 : " + height;
	}
	
	// 넓이를 구하는 기능
	@Override
	public double CalculateArea()
	{
		return width * height * 0.5;
	}
	
//	@Override
//	public void PrintArea()
//	{
//		System.out.println("삼각형의 넓이는 : " + CalculateArea() + "cm^2 입니다.");
//	}
}
