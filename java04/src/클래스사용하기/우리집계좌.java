package 클래스사용하기;

import 클라스만들기.계좌;

public class 우리집계좌 {

	public static void main(String[] args) {
		계좌 me = new 계좌();
		me.이름 = "홍길동";
		me.계좌이름 = "튼튼적금";
		me.금액 = 1000;
		
		me.적금하다();
		
		계좌 he = new 계좌();
		he.이름 = "박길동";
		he.계좌이름 = "튼튼예금";
		he.금액 = 2000;
		
		he.예금하다();
		
		계좌 she = new 계좌();
		she.이름 = "홍기사";
		she.계좌이름 = "다음적금";
		she.금액 = 3000;
		
		he.적금하다();
		

	}

}
