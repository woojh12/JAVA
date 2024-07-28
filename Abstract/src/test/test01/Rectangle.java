package test.test01;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea()
	{
		return width * height;
	}
	
	@Override
	public double calculateRound()
	{
		return 2 * (width + height);
	}
}
