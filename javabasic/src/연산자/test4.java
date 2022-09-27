package 연산자;

public class test4 {

	public static void main(String[] args) {

		int p = 66;
		int m = 77;
		int e = 88;
		int k = 99;
		
		int sum = p + m + e + k;
		int count = 4;
		// 정수와 정수 계산은 모두 정수이다
		//결과가 실수로 나오더라도 정수로 만들어버린다
		//따라서 결과를 실수로 얻고 싶으면
		//둘 중 하나를 실수로 만들어야 한다
		double avg = (double) sum / count;
		System.out.println("평균은" + avg);
		
		double pi = 3.14;
		double r = 2.2;
		
		double o = pi * r * r;
		System.out.println("원의 면적은" + o);
				
		
	}

}
