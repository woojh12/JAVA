package test.test01;

public class Test01 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];		// 배열 공간 할당

	    shapes[0] = new Rectangle(10, 25);
	    shapes[1] = new Circle(8);
	    
	    for(int i = 0; i < shapes.length; i++)
	    {
	    	Shape shape = shapes[i];
	    	
//	    	System.out.println("넓이 : " + shape.calculateArea() + "둘레 : " + shape.calculateRound());
	    	
	    	shape.printAreaAndRound();
	    }
	    
	}
}
