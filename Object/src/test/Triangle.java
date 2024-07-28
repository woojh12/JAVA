package test;

public class Triangle {
	private double width = 0.0; 
	private double height = 0.0;
	
	public Triangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double area()
	{
		return width * height * 0.5;
	}
	
	@Override
	public String toString()
	{
		return "밑변 : " + this.width + " 높이 : " + height + " 넓이 : " + area();
	}
}
