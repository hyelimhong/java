package 스레드;

import java.sql.Date;

public class 시각스레드 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				
				System.out.println(i);
			
				
			}
		}
}
