package test.test02;

public class Rect extends Shape {
	private int width;
	private int height;
	
	public Rect(int width, int height)
	{
		this.name = "사각형";
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString()
	{
		return "가로 : " + width + "세로 : " + height;
	}
	
	// 넓이 구하는 기능
	@Override
	public double CalculateArea()
	{
		return width * height;
	}
	
	// 넓이 출력
//	@Override
//	public void PrintArea()
//	{
//		System.out.println("사각형의 넓이는 : " + CalculateArea() + "cm^2 입니다.");
//	}
}
