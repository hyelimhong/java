package 클래스사용하기;

import 클라스만들기.계산기2;

public class 내가게 {

	public static void main(String[] args) {
		// 자바는 입력값이 다르면 메서드 이름 동일해도 된다
		
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(200, 100);
		double result2 = cal2.add(100, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("ok", 100);
		int result5 = cal2.multi(3000, 4);
		int result6 = cal2.div(result5, 4);
		
		
		
		System.out.println("더한 값1은 " + result);
		System.out.println("더한 값2은 " + result2);
		System.out.println("더한 값3은 " + result3);
		System.out.println("더한 값4은 " + result4);
		System.out.println("1명당 내야하는 값은 " + result6);
		

	}

}
