package methodclass;

public class Main {
	public static void main(String[] args) {
		
		printData(fullName("ライザ","ヘレティック"),27,1.8,76.5);
		printData(fullName("ジョン","クリストファー","スミス"),65,1.75,80.0);
	}
	
	public static void printData(String name, int age,double height,double weight) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "㎏です");
		double bmi = bmi(height,weight);
		System.out.println("BMIは" + bmi + "です");
	}
	
	public static String fullName(String firstName,String lastName) {
		return firstName + " " + lastName;
	}
	
	public static String fullName(String firstName,String middleName,String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public static double bmi(double height,double weight) {
		return weight/height/weight;
	}
	
} //classMain
