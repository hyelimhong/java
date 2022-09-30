package 클라스만들기;

public class 전화기 {
	//전화기가 가지는 공통적인 성질 :size 스피커
	//맴머변수는 값을 넣지 않고 선언만
	//자동초기화된다
	public int size; //0으로 자동초기화
	public String speaker; //""으로 자동초기화
	//자동초기화 -> 멤버변수, 배열
	//동작을 정의 : 통화하다, 사진을 찍다
	//멤버메서드(함수)
	public void 통화하다() {
		System.out.println("전화기로 통화하다");
		
		//처리내용을 순서대로 써준다
	}
	//전화기의 기능 : 전화하다, 사진을 찍다,
	public void 사진을찍다() {
		System.out.println("전화기로 셀카를 찍다");
	}
}
