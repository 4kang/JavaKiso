package test1;

public class For {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("i=" + i);
		}
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("合計＝" + sum);
	}

}
