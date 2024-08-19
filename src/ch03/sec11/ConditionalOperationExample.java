package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		String grade = (score > 60) ? "합격" : "불합격";
		System.out.printf("당신의 점수는 %d점이며, 최종 [%s]입니다.", score, grade);
	}

}
