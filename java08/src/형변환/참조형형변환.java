package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;


public class 참조형형변환 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//큰<--작 자동형변환 up casting 업 캐스팅
		list.add("홍길동");
		list.add(100);
		list.add(0.2);
		list.add(new JButton());
		
		System.out.println(list.size());//개수
		
		
		
		String name = (String)list.get(0);
		//강제형변환, down casting 
		//int<--integer<--object
		//기본형과 관련된 처리를 하기 위해서 부품으로 크게 만들어놨음
		//기본형과 포장클래스 간에는 자동변환이 가능
		//int --> integer : boxing 포장한다는 의미
		//int<-- integer : unboxing 언박싱
		//이 두개가 자동으로 이루어진다 autoboxing autounboxing
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4);
		
		
		
	}
	
	
	
}
