package 크롤링;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		//1.사이트에 연결해서 html 문서를 다 가지고 오자
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//			Elements list = doc.select(".code"); 
//			System.out.println(list.size());
//			Element tag = list.get(0);
//			System.out.println( tag.text());

			
			
			Elements list = doc.select(".blind"); 
			
		for (int i = 0; i < list.size(); i++) {
			Element tag = list.get(i);
			System.out.println(i + ":" + tag);
		}
		//현재가
		Element tag = list.get(16);
		System.out.println(tag.text());
			
		}
	
		
		  catch (Exception e) {
		  }
		  
			
		

	}
}
	
