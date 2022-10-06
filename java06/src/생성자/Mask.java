package 생성자;

public class Mask {

		String color; 
		int price;
		int count;
		//생성자 하나도 없어도
		//자동으로 입력값없는 생성자를 만들어준다
		//기본생성자
		
		//무조건 넣어야 가능한 경우
		//객체 생성시 멤버변수값을 바로 넣는 경우
		//넣을 데이터를 파라메터로 해서 생성자를 반드시 만들어준다
		public Mask(String color, int price, int count) {
	
			this.color = color;
			this.price = price;
			this.count = count;
		}
}
