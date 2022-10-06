package 정적static;

public class Day {

	
		String doing;
		int time;
		String location;
		static int count; //static 객체랑 상관없이 하나만 딱 만드는거
		static int total_time;
		
		public Day(String doing, int time, String location) {
			count++;
			total_time += time;
			this.doing = doing;
			this.time = time;
			this.location = location;
			 
			
		}
		//일반메서드는 객체생성 후 주소로 접근해서 호출해야한다
		//일반메서드는 객체생성 후 호출 할 수 있다
		public static double getAvg() {
			return total_time / (double) count ;
		}
		
		
		
		
		@Override
		public String toString() {
			return "나의 하루 [doing=" + doing + ", time=" + time + ", location=" + location + "]";
		}
		
		
}
