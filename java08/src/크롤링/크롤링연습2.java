package 크롤링;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		//1.사이트에 연결해서 html 문서를 다 가지고 오자
		try {
			Document doc = Jsoup.connect("http://naver.com").get();
			Elements list = doc.select(".nav"); //class가 nav인 태그를 찾아서 묶어서 가지고 와
			//elements는 arraylist의 자식
			System.out.println(list.size());
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
//			
			for (int i = 0; i < list.size(); i++) {
				//System.out.println(list.get(i));
				Element tag = list.get(i);
				System.out.println(i + " : " + tag.text());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
