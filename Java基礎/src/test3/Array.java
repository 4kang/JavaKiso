package test3;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		
		Setget player = new Setget();
		
		System.out.println("------主人公の情報------");
		player.setName("まゆ");
		player.setMoney(2000);
		player.setHp(1000);
		
		System.out.println("名前：" + player.getName());
		System.out.println("所持金：$" + player.getMoney());
		System.out.println("体力" + player.getHp());
		
		//ArrayListクラスを使う際はインポートする必要がある
		List<String> items = new ArrayList<>();
		
		items.add("炎の剣");
		items.add("普通の防具");
		items.add("回復薬");
		
		System.out.println("-----勇者の持ち物-----");
		System.out.println(items.get(0));
		System.out.println(items.get(1));
		System.out.println(items.get(2));
		

	}

}
