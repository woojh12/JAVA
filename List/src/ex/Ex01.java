package ex;

// ctrl + shift + o : 자동 임포트
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		// 리스트
		// 같은 형태의 데이터를 여러개 저장하는 자료구조
		// 순서가 존재한다.
		
		List<Integer> numberList = new ArrayList<>();
		
		// 값 추가
		numberList.add(25);
//		numberList.add("zzzzz");		// 타입에 맞는 데이터만 저장됨.
		numberList.add(10);
		
		System.out.println(numberList);
		
		// 값 삽입
		numberList.add(1, 20);
		System.out.println(numberList);
		
		// 값 얻어 오기
		Integer number1 = numberList.get(2);
		System.out.println(number1);
		
		// 정수값만 얻어오는 경우 primitive 타입으로 받아오는게 바람직함.
		int number2 = numberList.get(1);
		System.out.println(number2);
		
		// 값 수정
		numberList.set(0, 1111111);
		System.out.println(numberList);
		
		// 값 삭제
		numberList.remove(2);
		System.out.println(numberList);
		
		// 리스트 비우기
		numberList.clear();
		System.out.println(numberList);
		
		// 문자열 리스트
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("bear");
		stringList.add("chair");
		System.out.println(stringList);
		
		stringList.set(2, "car");
		System.out.println(stringList);
		
		// 값 삭제 
		stringList.remove(1);
		System.out.println(stringList);
		
		// 값을 통한 삭제(객체를 통한 삭제)
		stringList.remove("apple");
		System.out.println(stringList);
		
	}
}
