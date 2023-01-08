package test1;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		System.out.println("男の子、女の子、どちらを選びますか？");
		System.out.println("■男の子■女の子");
		
		Scanner scn = new Scanner(System.in);
		String danjo = scn.nextLine();
		
		if(danjo.equals("男の子")) {
			System.out.println("男の子を選択しました。");
		}else if(danjo.equals("女の子")){
			System.out.println("女の子を選択しました");
		}else {
			System.out.println("選択してください。");
		}
		
		System.out.println(danjo + "の偽名を決めてください。");
		String name = scn.nextLine();
		System.out.println(name + "でよろしいですか？");
	}

}
