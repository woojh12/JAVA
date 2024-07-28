package ex;

public class Ex01 {
	public static void main(String[] args) {
		// 특정 문자열을 10번 출력하는 기능
		
		// thread객체 두개 생성 후 실행시 동시에 실행됨
//		ThreadExtends thread1 = new ThreadExtends("###");
//		ThreadExtends thread2 = new ThreadExtends("@@@");
//		thread1.start();
//		thread2.start();
		
		ThreadImplements threadImple = new ThreadImplements("###");		// start 메소드 없음
		Thread thread = new Thread(threadImple);
		thread.start();
		
		// 특정 Thread가 끝날때까지 기다리기
		try {				// thread 먼저 실행 & 끝나고 메인 실행
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("끝");
	}
}
