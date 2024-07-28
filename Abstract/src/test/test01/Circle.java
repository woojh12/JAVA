package test.test01;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius)
	{
		super("원");			// 부모 클래스 생성자 호출
		this.radius = radius;
	}
	
	@Override
	public double calculateArea()
	{
		return radius * radius * 3.14;
	}
	
	@Override
	public double calculateRound()
	{
		return 2 * radius * 3.14;
	}
}
