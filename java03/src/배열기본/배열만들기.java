package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		//값을 이미 알고있는 경우
		int[] s = {1, 2, 3, 4,5,6,7 };
		//변수가 만들어진 개수 : 변수 s 1개 값 7개 length 1개 -> 8개
		//s에 주소가 들어가있다
		System.out.println("s에 저장된 주소 >>" + s);
		System.out.println(s[0]);
		//3번째, 6번째에 든 값
		System.out.println(s[2]);
		System.out.println(s[5]);
		
		
		//값을 아직 모르고 있는 경우
		int[] s2 = new int[5];
		//변수가 만들어진 개수 :변수 s2 1개 값 5개  length 1개 -> 7개
		System.out.println("s2에 저장된 주소 >>"+ s2);
		System.out.println(s2[0]);
		//배열은 많은 양의 데이터를 쓸 때 편하라고 만들어놓은 부품
		//빈 공간을 여러개 만들 때 초기화 시켜주는 기능이 있다
		//int-> 0으로 초기화 double -> 0.0으로 초기화
		//boolean -> false로 초기화
		//배열은 자동초기화해줌
		
		//배열의 각 인덱스에 값 대입
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		//마지막위치에 500을 대입
		s2[s2.length -1] = 500;
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);
		
	}

}
