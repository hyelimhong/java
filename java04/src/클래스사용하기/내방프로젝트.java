package 클래스사용하기;

//class 위치를 지정함
import 클라스만들기.전화기;
import 클라스만들기.강아지;

public class 내방프로젝트 {

	public static void main(String[] args) {
		//전화기 넣어보기
		전화기 p1 = new 전화기();
		//p1운 참조형변수 (주소)
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		
		p1.통화하다();
		p1.사진을찍다();
		
		
		
		//전화기 1대 추가
		//전화기의 속성, 기능
		전화기 p2 = new 전화기();
		System.out.println(p2);
		p2.size = 30;
		p2.speaker = "우주사";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		
		
		//강아지 가져오기
		//강아지의 속성, 동작시키기
		
		강아지 p3 = new 강아지();
		System.out.println(p3);
		p3.species = "푸들";
		p3.size = "small";
		System.out.println(p3.species);
		System.out.println(p3.size);
		
		p3.꼬리흔들다();
		p3.짖다();
		
		
		
	}

}
