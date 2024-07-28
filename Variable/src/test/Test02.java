package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 80;
		char hakjum1 = 'A';
		char hakjum2 = 'B';
		double avg1 = 4.0;
		double avg2 = 3.0;
		
		System.out.println("시험 성적이 " + score1 + "점 이상이면 " + hakjum1 + "학점이고 평점은 " + avg1 + " 입니다.");
		System.out.println("시험 성적이 " + score2 + "점 이상이면 " + hakjum2 + "학점이고 평점은 " + avg2 + " 입니다.");
		
		System.out.println("\n\n");
		
		int number1 = 33;
		double number2 = 35.325;
		double result = number1 * number2;
		
		System.out.println("두 수의 곱 : " + result);
		
		int time = 943;
		int day = time / 24;
		
		System.out.println("\n\n");
		
		System.out.println(time + "시간은 " + day + "일 입니다.");
		
		System.out.println("\n\n");
		
		int length1 = 8;
		int length2 = 9;
		
		int area1 = length1 * length2;
		double area2 = length1 * length2 * 0.5;
		
		System.out.println("사각형의 넓이 : " + area1);
		System.out.println("삼각형의 넓이 : " + area2);
		
		System.out.println("\n\n");
		
		int kor = 93;
		int math = 88;
		int eng = 94;
		double avgScore = (kor + math + eng) / 3.0;
		
		System.out.println("국어 " + kor + "점" + " 수학 " + math + "점" + " 영어 " + eng + "점");
		System.out.println("평균 : " + avgScore);
		
		System.out.println("\n\n");
		
		int temp1 = 30;
		double temp2 = ((9 / 5.0) * (double)temp1) + 32;
		
		System.out.println("섭씨 " + temp1 + "도는 화씨 " + temp2 + "도 입니다.");
		
	}
}
