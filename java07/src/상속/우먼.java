package 상속;

public class 우먼 extends 사람 {
	String hair;
	
	public void 똑똑하다() {
		System.out.println("매우 똑똑하다");
		
		
	}

	@Override
	public String toString() {
		return "우먼 [hair=" + hair + ", gender=" + gender + ", name=" + name + "]";
	}

	
	
}
