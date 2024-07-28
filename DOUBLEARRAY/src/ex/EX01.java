package ex;

public class EX01 {
	public static void main(String[] args) {
		
		// 3명의 학생의 5개의 성적 확보
		
		int[][] scores = {
				{90, 85, 95, 85, 100},
				{60, 55, 70, 80, 45},
				{100, 30, 60, 90, 70}
				};
		
		System.out.println("첫번째 학생의 세번째 점수 : " + scores[0][2]);
	}
}
