//Main
package rpg;

import java.util.Scanner;

public class Rpg {

	public static void main(String[] args) {
		//主人公のステータス
		Hero hero = new Hero();
		//set○○で値をセットする
		hero.setName("勇者A");
		hero.setAttac(20);
		hero.setHp(100);
		
		//アイテム
		Item items = new Item();
		items.setName("回復薬");
		items.setCount(3);
		
		//魔王のステータス
		Maou satan = new Maou();
		satan.setAttac(10);
		satan.setHp(200);
		
		System.out.println("-------------------------");
		System.out.println(hero.getName() + "の行動を決めろ！");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		 
		/*魔王の体力もしくは主人公の体力が無くなるまで戦闘の繰り返しを行う*/
	}

}
