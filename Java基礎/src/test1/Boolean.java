package test1;

public class Boolean {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean bool = 3 * 9 == 27;
		System.out.println(bool);
		
		System.out.println(true);
		System.out.println(false);
		System.out.println(6 + 2 == 5);
		System.out.println(6 + 2 != 5);
		
		
		//if文で使うboolean型
		int num1 = 1;
		int num2 = 2;
		
		if(num1 == num2) {
			System.out.println("num1とnum2は一致しています。");
		}else if(num1 > num2) {
			System.out.println("num1の方が大きいです。");
		}else {
			System.out.println("num2の方が大きいです。");
		}
		
		
		//forで使うboolean型
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		
		//whileで使うboolean型
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}

	}

}
