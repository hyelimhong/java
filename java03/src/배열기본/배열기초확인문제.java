package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] s = new int[5];
		System.out.println(s);
		//배열의 크기 : 변수 s 1개 + 값 5개 + length 1개 -> 총 7개
		s[0] = 100;
		s[2] = 200;
		s[s.length-1] = 500;
		
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[s.length-1]);
		
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//	}
		for (int x : s) {
			System.out.println(x);
		}
		}
	}


