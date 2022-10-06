package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		//main안에서만 쓸 수 있는 지역변수
		//지역변수는 자동초기화 불가능 내가 시켜줘야함
		Day day1 = new Day("자바공부", 8, "집");
		System.out.println(day1);
		System.out.println(Day.count);
		System.out.println(Day.total_time);
		Day day2 = new Day("운동", 1, "헬스장");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println(Day.total_time);
		Day day3 = new Day("넷플릭스", 1, "집");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println(Day.total_time);
	

	}

}
