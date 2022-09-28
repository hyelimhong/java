package 조건문;

public class Test02 {

	public static void main(String[] args) {
		String food = "짜장면";
		
		if (food.equals("짜장면")) {
			System.out.println("중국집으로 가요");
		} else if (food.equals("회")) {
			System.out.println("횟집으로 가요");
		} else if (food.equals("라면")) {
			System.out.println("분식집으로 가요");
		}
		else {
			System.out.println("그냥 안먹어요");
		}

	}

}
