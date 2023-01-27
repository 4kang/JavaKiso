package methodclass;

import java.lang.Math;

public class Main { //Mainクラス
	public static void main(String[] args) { //mainメソッド
		
		//printData(fullName("ライザ","ヘレティック"),27,1.6,50.0);
		//printData(fullName("ジョン","クリストファー","スミス"),65,1.75,80.0);
		Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
		Person.printData(Person.fullName("John","Christopher", "Smith"), 65, 1.75, 80.0);
		
		System.out.println("******************************");
		int max = Math.max(3, 8);
		System.out.println("最大値は" + max + "です");
	}
	
} //classMain
