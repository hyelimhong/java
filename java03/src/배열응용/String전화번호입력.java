package 배열응용;

public class String전화번호입력 {

	public static void main(String[] args) {
		String s = " 011-245-1234 ";
		
		String s1 = s.trim();
	
		String first = s.substring(0, 3);
		String second = s.substring(4, 7);
		
		switch (first) {
		case "011":
			System.out.println("SK");
			break;
		case "019":
			System.out.println("LG");
			break;
		default:
			System.out.println("APPLE");
			break;
		}
		
		if (second.length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		if (s.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		String s2 = "감자, 고구마, 양파";
		String[] s3 = s2.split(","); //,기준으로 해서 string배열을 만들어준다
									//"감자", "고구마", "양파"
		String[] s4 = s.split("-");
		if (s4[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		//equals()
		
		
	}

}
