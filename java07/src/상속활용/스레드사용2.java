package 상속활용;

public class 스레드사용2 {

	public static void main(String[] args) {
		스레드1 hungry = new 스레드1();
		스레드2 menu = new 스레드2();
		
		hungry.start();
		menu.start();

	}

}
