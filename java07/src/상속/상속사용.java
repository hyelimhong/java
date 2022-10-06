package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		
		System.out.println(m);
		
		슈퍼맨 sMan = new 슈퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		sMan.달리다();
		
		System.out.println(sMan);
		
		우먼 w = new 우먼();
		w.gender ="여자";
		w.name = "데이드";
		w.hair = "long";
		
		System.out.println(w);
		
		슈퍼우먼 sWan = new 슈퍼우먼();
		sWan.gender = "여자";
		sWan.name = "윌리";
		sWan.hair = "curly";
		sWan.오르다();
		
		System.out.println(sWan);
		
		
	}

}
