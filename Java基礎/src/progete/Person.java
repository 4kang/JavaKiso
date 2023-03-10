package progete;

public class Person {
	//インスタンスフィールド
	public String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	// int型のクラスフィールドcountを定義し、0を代入
	//public static データ型 変数名；
	public static int count = 0;
	//クラスメソッド　public static 戻り値の型 メソッド名(){}
	public static void printCount() {
		//「クラス名.クラスフィールド」でアクセス
		System.out.println("合計" + Person.count + "人です");
	}
	
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 変数countに1を足してください
		Person.count ++;
	}
	
	Person(String firstName, String middleName, String lastName, int age, double height, double weight){
		//他のコンストラクタを呼び出す
		this(firstName,lastName,age,height,weight);
		this.middleName = middleName;
	}
	
	public String fullName() {
		//middleNameがnullかどうかによって返す値を変えるようにする
		if(this.middleName == null) {
			return this.firstName + "" + this.lastName;
		}else {
			return this.firstName + "" + this.middleName + "" +lastName;
		}
	}
	
	public double bmi() {
		return this.weight/this.height/this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println(this.age + "歳");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	
	

}
