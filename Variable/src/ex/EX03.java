package ex;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 츄파춥스 가격을 입력받고, 3개의 가격을 출력
		System.out.println("츄파춥스 가격 입력 : ");
		int candy = scan.nextInt();
		int total = 3 * candy;
		
		System.out.println("츄파춥스 가격 : " + total + "원 입니다.");
		
		System.out.println("\n");
		
		
		// 두개의 수를 한번에 입력 받기
		// 츄파춥스 가격과 개수를 입력 받고 계산결과를 출력하는 프로그램
//		System.out.println("츄파춥스 가격 입력 : ");
//		candy = scan.nextInt();
//		
//		System.out.println("개수를 입력하세요 : ");
//		int count = scan.nextInt();
//		
//		total = candy * count;
//		
//		System.out.println("츄파춥스 " + count + "개의 가격은 " + total + "원 입니다.");
		
		System.out.println("츄파춥스 가격과 개수를 입력하세요 ---> ");
		candy = scan.nextInt();
		int count = scan.nextInt();
		
		total = candy * count;
		
		System.out.println("츄파춥스 " + count + "개의 가격은 " + total + "원 입니다.");
	}
}
