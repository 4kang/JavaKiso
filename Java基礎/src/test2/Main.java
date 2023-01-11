package test2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//呼び出し(newした後で、引数へ与えられた値を元にpokemonが生成される)
		Pokemon pikachu = new Pokemon(025, "ピカチュウ","ねずみポケモン","でんき",
				"つくる でんきが　きょうりょくな　ピカチュウほど　ほっぺの　ふくろは　やわらかく　よく　のびるぞ");
		
		//使用時
		System.out.print("No." + pikachu.number);
		System.out.println(" "+pikachu.name);
		System.out.print(pikachu.category);
		System.out.println(" "+pikachu.type + "タイプ");
		System.out.println(pikachu.description);

	}

}
