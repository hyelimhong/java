package 반복문;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iu = 0;
		int js = 0;
		int bts = 0;
		
		while (true) {
			System.out.println("입력 (1)아이유, (2)유재석, (3)방탄, (4)종료");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				
				iu = iu + 1;
			} else if (n1 == 2) {
				
				js = js + 1;
			} else if (n1 == 3){
				
				bts = bts + 1;
			} else {
				System.out.println("없는 번호입니다.");
			}
			System.out.println("더하시겠습니까? 종료(1), 계속(2)>>");
			int exit = sc.nextInt();
			
			if (exit == 1) {
			System.out.println("아이유 " + iu);
			System.out.println("유재석 " + js);
			System.out.println("방탄 " + bts);
			System.exit(0);
		}
		}
		
	}

}
