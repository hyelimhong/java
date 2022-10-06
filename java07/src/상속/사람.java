package 상속;

public class 사람 extends Object { //8개 메서드
	//멤버변수 2개 추가
	String gender;
	String name;
	
	//멤버메서드 2개추가
	public void 잠자다() {
		System.out.println("잠자다.");
	}
	
	public void 먹다() {
		System.out.println("먹다.");
	}
	
	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";
	}
}
