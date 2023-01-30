package methodclass;

import java.util.Scanner;
import java.lang.Math;

public class Main { //Mainクラス
	public static void main(String[] args) { //mainメソッド
		
		//printData(fullName("ライザ","ヘレティック"),27,1.6,50.0);
		//printData(fullName("ジョン","クリストファー","スミス"),65,1.75,80.0);
		Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
		Person.printData(Person.fullName("John","Christopher", "Smith"), 65, 1.75, 80.0);
		
		int max = Math.max(3, 8);
		System.out.println("最大値は" + max + "です");
		System.out.println("******************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前：");
		String firstName = scanner.next();
		
		System.out.print("名字：");
		String lastName = scanner.next();
		
		System.out.print("年齢：");
		int age = scanner.nextInt();
		
		System.out.print("身長(m)：");
		double height = scanner.nextDouble();
		
		System.out.print("体重(㎏)：");
		double weight = scanner.nextDouble();
		
		Person.printData(Person.fullName(firstName, lastName),age,height,weight);
	}
	
} //classMain
