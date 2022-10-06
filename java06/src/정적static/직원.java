package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int total_age;
	public 직원(String name, int age, String gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		total_age += age; 
	}
	
	
	public static double getAvg() {
		return total_age / (double)count ;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
