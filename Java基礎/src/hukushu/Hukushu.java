package hukushu;

public class Hukushu {
	//設定
	public String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	//sss
	Hukushu(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	Hukushu(String firstName,String middleName, String lastName, int age, double height, double weight){
		this(firstName,lastName,age,height,weight);
		this.middleName = middleName;
	}
	
	public String fullName() {
		//null=何のデータも含まれない状態のこと
		if(this.middleName == null) {
			return this.firstName + "" + this.lastName;
		}else {
			return this.firstName + "" + middleName + "" + this.lastName;
		}
	}
	
	
}


