package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		// 정수 실수 문자1글자 논리 : 기본데이터
		//ram에 넣어보자
		int age = 100;
		double height = 122.2;
		char gender = '여';
		boolean food = true;
		
		
		//기본데이터 아니지만 너무 많이 써서 기본데이터처럼 사용하는 부품 String
		
		String name = "홍길동";
		System.out.println("나의 이름은" + name);
		System.out.println("나의 나이는" + age);
		System.out.println("나의 키는" + height);
		System.out.println("나의 성별은" + gender);
		System.out.println("내가 밥을 먹었나?" + food);
	}

}
