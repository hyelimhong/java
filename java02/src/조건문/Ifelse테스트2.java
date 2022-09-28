package 조건문;

public class Ifelse테스트2 {

	public static void main(String[] args) {
		int score = 83;
		//string result; 이렇게 쓰면 result 안에 쓰레기값이 들어간다
		//이러면 연산도 안되고 출력도 안됨
		String result = ""; //이렇게 입력해서 초기화 시켜야함
		//변수를 선언할 때는 초기값을 넣어야함.
		//조건이 맞으면 내용을 처리하고 break!를 건다
		//아래에 있는  조건들은 실행하지 않는다
		if (score >= 90) {
			result = "A학점";
		} else if ( score >= 85 && score < 90){
			result = "B+학점";
		} else if ( score >= 80 && score < 85){
			result = "B-학점";
		}
		else if (score >= 70 ) {
			result = "C학점";
		} else {
			result = "D학점";
		}
		
		System.out.println("당신의 학점은 " + result);
		
		
		

	}

}
