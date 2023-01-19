package test4;

public class BreakeWhile {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i==50) {
				break;
			}
			if(i%2==0) {
				num += i;
			}
		}
		
		System.out.println("偶数の合計：" + num);
	}

}
