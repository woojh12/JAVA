package test.test01;

public class Circle {
	private double r;
	private final double pi = 3.14;
	private double area;
	private double round;
	private double countarea;
	
	public Circle(double r)
	{
		this.r = r;
	}
	
	public double getArea()
	{
		area = r * r * pi;
		
		return area;
	}
	
	public double getRound()
	{
		round = 2 * r * pi;
		
		return round;
	}
	
	public double countgetArea()
	{
		area = r * r * pi;
		countarea = 25 * area;
		
		return countarea;
	}
	
	public void printInfo(){
		System.out.println("원의 넓이 : " + getArea());
		System.out.println("원의 둘레 : " + getRound());
		System.out.println("원 25개 넓이 : " + countgetArea());
	}
}
