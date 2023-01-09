package test1;

public class Hairetsu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] arr = new int[] {8,12,21};
		
		System.out.println("朝食" + arr[0] + "時からです");
		System.out.println("昼食" + arr[1] + "時からです");
		System.out.println("夕食" + arr[2] + "時からです");
		
		String[] names = {"John","KAte","Bob"};
		System.out.println("私の名前は" + names[0] + "です。");
		
		//配列の上書き
		names[0] = "ウィリアム";
		names[1] = "ジョン";
		names[2] = "ボブ";
		System.out.println(names[0]);
		
		//配列と繰り返し(for文)
		for(int i = 0; i < 3; i++) {
			System.out.println("こんにちは" + names[i]);
		}
		
		//length機能
		for (int i = 0; i < names.length; i++) {
			System.out.println("こんにちは" + names[i]);
		}

	}

}
