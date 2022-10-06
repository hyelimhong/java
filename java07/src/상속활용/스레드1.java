package 상속활용;

public class 스레드1 extends Thread {
	
		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
				System.out.println(i + "만큼 배고파");
			}
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
