package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			//1부터 1씩 증가하면서 10까지 처리!
			//System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("---------");
		//3~11
		int sum2 =0;
		for (int i = 3; i < 12 ; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}

}
