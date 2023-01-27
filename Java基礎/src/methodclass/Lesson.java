package methodclass;

import java.util.Scanner;

public class Lesson {

public static void main(String[] args) {
		
		//メソッド名
		hello();
		hello("Lumine");
		charaSte("☆5片手剣",520);
		printPrice("ピザ",3000);
		
		int total = add(7,5);
		System.out.println(total);
		
		System.out.println(average(3,8));
		
		//真偽値を返すメソッド
		int number = 9;
		if(isEven(number)) {
			System.out.println(number + "は偶数です");
		}else {
			System.out.println(number + "は奇数です");
		}
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("あなたの名前："); //printは改行しない
		String name = scanner.next();
		
		System.out.println("あなたの名前は" + name + "です");
		
		System.out.print("年齢：");
		int age = scanner.nextInt();
		System.out.print("体重：");
		double weight = scanner.nextDouble();
		System.out.println("あなたの年齢は" + age + "歳です");
		System.out.println("あなたの体重は" + weight + "㎏です");
	}
	
	//クラスの中にメソッドを定義
	public static void hello() {
		System.out.println("ログイン");
	}
	public static void hello(String name) {
		//実行する処理
		System.out.println(name + "さんこんにちは");
	}
	
	public static void charaSte(String buki, int status) {
		System.out.println(buki + "の基礎攻撃力は" + status +"です");
	}
	
	public static void printPrice(String item, int status) {
		System.out.println(item + "は" + status + "円です");
	}
	
	public static double average(int a, int b) {
		int total = add(a,b);
		return (double)total/2;
	}
	
	//戻り値
	public static int add(int a, int b) {
		return a+b;
	}
	
	//真偽値を返すメソッド
	public static boolean isEven(int a) {
		return a % 2 == 0;
	}
	
}
