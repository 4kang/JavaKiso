package test2;

class Constructortest { //クラス名
	
	String str = "ポケモン図鑑";
	
	//コンストラクタに関する記述
	public Constructortest() { //インスタンスを生成する際に行う処理
		System.out.println(str);
	}
}

public class Main {

	public static void main(String[] args) {
		//インスタンスメソッドの呼び出し
		Person person1 = new Person();
		person1.hello();
		
		//インスタンスフィールド(インスタンスが持つ情報)
		person1.name = "河野";
		System.out.println(person1.name);
		
		Person person2 = new Person();
		person2.hello();
		
		person2.name = "鈴木";
		System.out.println(person2.name);
		
		//クラス名　変数名　= new クラス名(引数);
		Constructortest cs = new Constructortest();
		
		//呼び出し(newした後で、引数へ与えられた値を元にpokemonが生成される)
		Pokemon pikachu = new Pokemon(025, "ピカチュウ","ねずみポケモン","でんき",
				"つくる でんきが　きょうりょくな　ピカチュウほど　ほっぺの　ふくろは　やわらかく　よく　のびるぞ");
		
		//使用時
		System.out.print("No." + pikachu.number);
		System.out.println(" "+pikachu.name);
		System.out.print(pikachu.category);
		System.out.println(" "+pikachu.type + "タイプ");
		System.out.println(pikachu.description);
		
		//コンストラクタのthis
		Animal Animal1 = new Animal();
		Animal1.category = "犬"; Animal1.today();
		
		Animal Animal2 = new Animal();
		Animal2.category = "猫"; Animal2.today();

	}

}
