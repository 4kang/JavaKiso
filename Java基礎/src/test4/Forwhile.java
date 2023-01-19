package test4;

public class Forwhile {

	public static void main(String[] args) {
		
		int sum1 = 0; //偶数
		int sum2 = 0; //奇数
		
		for (int x = 0; x <= 100; x++) {
			if(x%2==0) {
				sum1 += x;
			}else {
				sum2 += x;
			}
		}
		
		System.out.println("-----for文の四則演算-----");
		System.out.println("偶数の合計" + sum1);
		System.out.println("奇数の合計" + sum2);
		
		int i = 0;
		int sum3 = 0;
		int sum4 = 0;
		
		while(i <= 100) {
			if(i%2==0) {
				sum3 += i;
			}else {
				sum4 += i;
			}
			i++;
		}
		
		System.out.println("-----whileの四則演算-----");
		System.out.println("偶数の合計" + sum3);
		System.out.println("奇数の合計" + sum4);

	}
}
