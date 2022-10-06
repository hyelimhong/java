package 생성자;

public class Maskuse {

	public static void main(String[] args) {
		// 객체생성 후, 멤버 변수값을 나주엥 넣어도 되는 경우
//		 Mask m = new Mask();
//		 m.color = "흰색";
//		 m.count = 1;
//		 m.price = 1000;
//		 
		 Mask m1 = new Mask("검정색", 2500, 2);
		 System.out.println(m1.color);
		 System.out.println(m1.price);
		 System.out.println(m1.count);
	}

}
