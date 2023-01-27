package methodclass;

public class Main {

	public static void main(String[] args) {
		
		//メソッド名
		hello("Lumine");
		charaSte("☆5片手剣",520);
		printPrice("ピザ",3000);
		
		int total = add(7,5);
		System.out.println(total);
		
	}
	
	//クラスの中にメソッドを定義
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
	
	//戻り値
	public static int add(int a, int b) {
		return a+b;
	}

} //classMain
