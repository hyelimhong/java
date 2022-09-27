package 연산자;



public class Test01 {

	public static void main(String[] args) {
		
		char pw1 = 'p';
		
		char pw2 = 'q';
		
		if ( pw1 == pw2) {
			System.out.println("pass!");
		} else {
			System.out.println("재입력!");
		}
		
		double change =2.2;
		
		if ( change >=2) {
			System.out.println("다이어트 성공!");

		} 
		
		if (pw1 == pw2 && change >=2) {
			System.out.println("성공!");
		} else {
			System.out.println("다시 도전!");
		}
		
		
		 
		
		

	}

}
