package 생성자;

public class 통장 {
	//멤버변수 class 아래에 선언, class 전체에서 쓸 수 있는 전역변수
	//글로벌변수(global)
	String name;
	String ssn;
	int money;
	
	
	//source -> generate constructor
	//메서드 이름을 클래스이름과 동일하게 void 사용안함
	
	public 통장(String name, String ssn, int money) {
	
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	
}
