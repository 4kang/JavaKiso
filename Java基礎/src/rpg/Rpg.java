//Main
package rpg;

public class Rpg {

	public static void main(String[] args) {
		//主人公のステータス
		Hero shujinko = new Hero();
		//set○○で値をセットする
		shujinko.setName("勇者A");
		shujinko.setAttac(20);
		shujinko.setHp(100);
		
		//魔王のステータス
		Maou satan = new Maou();
		satan.setAttac(10);
		satan.setHp(200);
		
		System.out.println("彼の名前は" + shujinko.getName());

	}

}
