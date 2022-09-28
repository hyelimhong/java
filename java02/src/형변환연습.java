
public class 형변환연습 {

	public static void main(String[] args) {
		int a = 100; //4개 
		byte b = 50; //1개
		a = b; //int <-- byte
		//타입변환(형변환)
		
		int c = 200; //4개
		b = (byte)c;
		//작은공간 <-- 큰공간 으로 가려면 강제형변환이 필요하다
		//조심할것은 작은 공간에 들어갈 수 있는 범위여야 함
		//얘는 범위를 벗어남
		//byte -128-127 int c = 100으로 바꾸며 가능
	}

}
