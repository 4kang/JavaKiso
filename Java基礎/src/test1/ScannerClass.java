package test1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//　Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner scn = new Scanner(System.in);
		
		//入力を促すメッセージ
		System.out.print("名前を入力して下さい：");
		//入力された内容をインスタンスから取得
		String input_text = scn.nextLine();
		//入力された内容を画面に表示
		System.out.println(input_text + "です。");
		
		System.out.print("ライバルの名前は？：");
		String tex = scn.nextLine();
		System.out.println(tex + "です。");
		
		//年齢
		System.out.print("何歳ですか？：");
		int num = scn.nextInt();
		System.out.println(num + "歳です。");
		
	}

}
