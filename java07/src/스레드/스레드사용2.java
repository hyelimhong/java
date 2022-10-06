package 스레드;

public class 스레드사용2 {

	
	
	public static void main(String[] args) {
		
		스레드1 t1 = new 스레드1();
		스레드2 t2 = new 스레드2();
		스레드3 t3 = new 스레드3();
		
		//2번의 객체로 start() 메서드 호출
		t1.start();
		t2.start();
		t3.start();
	}
}
