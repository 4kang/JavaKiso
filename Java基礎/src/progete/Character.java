package progete;

public class Character { //クラス名
	
	private static int count = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	
	Character(String firstName, String lastName, int age, double height, double weight){
		count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	Character(String firstName, String middleName, String lastName, int age, double height, double weight){
		this(firstName, lastName, age, height, weight);
		this.middleName = middleName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String fullName() {
		if(this.middleName == null) {
			return this.firstName + " " + this.lastName;
		}else {
			return this.firstName + " " + this.middleName + "" + this.lastName;
		}
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	
	public static void printCount() {
		System.out.println("合計" + Character.count + "人です");
	}

}
