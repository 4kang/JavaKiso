package test1;

public class For {
	public static void main(String[] args) {
		
		/*for (int i = 0; i <= 3; i++) {
			System.out.println("i=" + i);
		}
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("合計＝" + sum);*/
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		
		System.out.println("偶数の合計=" + sum1);
		System.out.println("奇数の合計=" + sum2);
	}

}
