package test1;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("-------------------");
		System.out.println("鍵がかかっている。");
		System.out.println("「どの鍵を使おうか？」");
		System.out.println("どのアイテムを利用しますか？");
		System.out.println("-------------------");
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		if(str.equals("寝室の鍵")) {
			System.out.println("鍵が開いた！");
		}else {
			System.out.println("鍵が合わないようだ。");
		}
		
		

	}

}
