package test4;

public class BreakeWhile {

	public static void main(String[] args) {
		
		//for
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
		
		//While
		int num1 = 0;
		int i = 0;
		
		while(i <= 100) {
			if(i==50) {
				break;
			}
			if(i%2==0) {
				num1 += i;
			}
			i++;
		}
		System.out.println("偶数の合計：" + num1);
		
		//do-while
		int num2 = 0;
		int x = 0;
		
		do {
			if(x==50) {
				break;
			}
			if(x%2==0) {
				num2 += x;
			}
			x++;
		}while(x <= 100);
		System.out.println("偶数の合計：" + num2);
	}

}
