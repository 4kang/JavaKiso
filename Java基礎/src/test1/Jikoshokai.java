package test1;

import java.util.Scanner;

public class Jikoshokai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前：　");
		String firstName = scanner.next();
		
		System.out.print("名字：　");
		String lastName = scanner.next();
		
		System.out.print("年齢：　");
		int age = scanner.nextInt();
		
		System.out.print("身長(m)：　");
		double height = scanner.nextDouble();
		
		System.out.print("体重(㎏)：　");
		double weight = scanner.nextDouble();
		
		printData(firstName, lastName, age, height, weight);
		
	}
	public static void printData(String firstName, String lastName, int age, double height, double weight) {
		
		System.out.println("名前は" + fullName(firstName, lastName) + "です");
		System.out.println("年齢は" + age + "歳です");
		
		if(age >= 20) {
			System.out.println("成年者です");
		}else {
			System.out.println("未成年者です");
		}
		
		System.out.println("身長は" + height + "です");
		System.out.println("体重は" + weight + "です");
		
	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
