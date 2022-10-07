package 크롤링;

import java.io.IOException;




import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습5 {

	public String naver (String code) {
		//1.사이트에 연결해서 html 문서를 다 가지고 오자
		//try안에서는 tag 접근불가 tag 텍스트 이용해서 return불가
		//return할 수 있게 밖으로 빼야함
		//지역변수라 직접 초기화 해야함 null로 
		
		Element tag = null, tag2 = null, tag3 = null;
		
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			System.out.println("-------");
		
			Elements list = doc.select("td.first").select(".blind"); 
			
			//System.out.println(list);
			 tag = list.get(0);
			System.out.println("전일가 " + tag.text());
			String yesterday = tag.text(); //전일가
		
			
			//현재가
			Elements list2 = doc.select("div.today").select(".blind");
			//System.out.println(list2);
			tag2 = list2.get(0);
			System.out.println("현재가 " + tag2.text());
			String today = tag2.text();
			
			//시가
			Elements list3 = doc.select("td.first").select(".blind");
			//System.out.println(list3);
			 tag3 = list3.get(1);
			System.out.println("시가 " + tag3.text());
			String now = tag3.text();
		}
	
		
		  catch (Exception e) {
		  }
		
		  return "전일가 " + tag.text() + "\n" +
		  "현재가 " + tag2.text() + "\n" + "시가 " + tag3.text();
		  
			
		

	}
}
	
