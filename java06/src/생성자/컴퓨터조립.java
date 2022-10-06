package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 c1 = new 컴퓨터(100000, 300, "apple");
		System.out.println(c1.price);
		System.out.println(c1.size);
		System.out.println(c1.com);
		System.out.println(c1);
		
		컴퓨터 c2  = new 컴퓨터(300000, 300, "samsung");
		System.out.println(c2.price);
		System.out.println(c2.size);
		System.out.println(c2.com);


	}
	
	


}
