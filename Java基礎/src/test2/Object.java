package test2;

public class Object {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//インスタンスメソッドの呼び出し
		Person person1 =new Person();
		person1.hello();
		
		//インスタンスフィールド(インスタンスが持つ情報)
		person1.name="河野";
		System.out.println(person1.name);
		
		Person person2 = new Person();
		person2.hello();
		
		person2.name = "鈴木";
		System.out.println(person2.name);
	}

}
