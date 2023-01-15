package test3;

public class Up {

	public static void main(String[] args) {
		
		//主人公の名前、所持金：1000、体力；2000
		Setget set = new Setget();
		set.setName("ミネルヴァ");
		set.setMoney(1000);
		set.setHp(2000);
		
		System.out.println("ステータス");
		System.out.println("名前：" + set.getName());
		System.out.println(set.getMoney() + "円");
		System.out.println("HP：" + set.getHp());

	}

}
