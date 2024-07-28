package ex.ex02;

public class EX02 {
	public static void main(String[] args) {

		// 여러 직사각형을 데이터화
		// 큰 사각형
		Rectangle bigRectangle = new Rectangle();
		bigRectangle.width = 45;
		bigRectangle.height = 47;
		
		// 작은 사각형
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.width = 6;
		smallRectangle.height = 5;
		
		// 큰 사각형 넓이
		int area = bigRectangle.width * bigRectangle.height;
		System.out.println("넓이 : " + area);
		
		System.out.println("넓이 : " + bigRectangle.calculate());
		
		// 개수에 따른 넓이 구하기
		
		// 작은 사각형 5개의 넓이
		area = smallRectangle.calculateAreaByCount(5);
		
		System.out.println("5개의 넓이 : " + area);
		
		smallRectangle.printInfo();
	}
}


// http://marondal.com/lesson/material?lessonId=10238&lectureId=10010&lectureListId=10098
