package 생성자;

public class 컴퓨터 {
	int price;
	int size;
	String com;
	
	public 컴퓨터(int price, int size, String com) {
	
		this.price = price;
		this.size = size;
		this.com = com;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", size=" + size + ", com=" + com + "]";
	}
	
	
}
