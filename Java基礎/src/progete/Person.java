package progete;

public class Person {
	//インスタンスフィールド
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String fullName() {
		return this.firstName + " " + lastName;
	}
	
	public double bmi() {
		return this.weight/height/height;
	}

}
