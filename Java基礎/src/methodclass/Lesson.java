package methodclass;

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
