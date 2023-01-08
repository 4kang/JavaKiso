package test1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		System.out.println("貴方の好みの色は何色ですか？");
		System.out.println("1.赤　2.青　3.黄　4.緑");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("赤を選択した貴方は情熱的な方です。");
			break;
		case 2:
			System.out.println("青を選択した貴方は冷静沈着な方です。");
			break;
		case 3:
			System.out.println("黄を選択した貴方は社交的な方です。");
			break;
		case 4:
			System.out.println("緑を選択した貴方は気まぐれな方です。");
			break;
			default:
				System.out.println("選択肢以外を選択した貴方は注意力散漫です。");
				break;
		}
		
	}

}
