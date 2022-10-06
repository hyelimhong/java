package 상속활용;

public class 스레드2 extends Thread {
	@Override
	public void run() {
		String[] list = {"삼겹살","김치찌개","피자","치킨","떡볶이"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("메뉴 추천 >> " + list[i]);
		}
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
