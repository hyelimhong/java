package 배열응용;

public class String연습 {

	public static void main(String[] args) {

		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		//index = 위치값
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,9));
		System.out.println(s.contains("나"));
		System.out.println(s.lastIndexOf("머"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("머", ""));
		

	}

}
