package ex.ex02;

public class Rectangle {
	// 멤버 변수
	int width;
	int height;
	
	// 기능, 메소드, 멤버함수
	// 사각형 넓이 구하기 기능
	public int calculate()
	{
		int area = this.width * this.height;
		return area;
	}
	
	// 개수에 따른 넓이 구하기
	int calculateAreaByCount(int count)
	{
		int area = width * height * count;
		return area;
	}
	
	// 객체 정보 출력 기능
	void printInfo()
	{
		System.out.println("width : " + this.width);
		System.out.println("height : " + this.height);
	}
}