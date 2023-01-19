package test1;

public class While {

	public static void main(String[] args) {
		
		//While文の基本
		/*while(i < 2) {
			System.out.println((i + 1) + "回目の繰り返しです。");
			i++;
		}*/
		
		//変数の初期化
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		while(i <= 100) {
			if(i%2==0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			i++;
		}
		
		System.out.println("偶数の合計" + sum1);
		System.out.println("奇数の合計" + sum2);

	}

}
