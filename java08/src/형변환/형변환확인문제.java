package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); 
		//object <-- 자동형변환 -- integer <-- 오토박싱 -- int
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		int money = (int)me.get(0);
		System.out.println(money + 2000);
		double height = (double)me.get(1);
		System.out.println(height + 10);
		boolean food = (boolean)me.get(2);
		if (food) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호 1, 3");
		} else {
			System.out.println("주민번호 2, 4");
		}
		
		

	}

}
