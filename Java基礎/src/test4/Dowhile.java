package test4;

public class Dowhile {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		
		do {
			if(i%2==0){
				sum1 += i;
			}else {
				sum2 += i;
			}
			i++;
		}while(i <= 100);
		
		System.out.println("偶数の合計:" + sum1);
		System.out.println("偶数の合計:" + sum2);
		
	}

}
