package 배열응용;

import java.util.Scanner;

public class 입력받아배열넣기확인문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] year1 = new String [3];
		String [] year2 = new String [3];

		for (int i = 0; i < year2.length; i++) {
			System.out.println("작년에 가고 싶었던 곳>> ");
			
			year1[i] = sc.next();
			
			
		}
		
		for (int i = 0; i < year2.length; i++) {
			System.out.println("올해에 가고 싶었던 곳>> ");
			year2[i] = sc.next();
			
			
		}
		int count = 0;
		for (int i = 0; i < year2.length; i++) {
			
		
			if (year1[i].equals(year2[i])) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
	}

}
