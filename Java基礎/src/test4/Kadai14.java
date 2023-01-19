package test4;

public class Kadai14 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int i = 0;
		
		do {
			if(i==50) {
				i++;
				continue; // ループ（繰り返し）の現在の処理の残りをスキップし、ループ（繰り返し）の次の処理へ移る
			}
			if(i%2==0) {
				sum1 += i;
			}
			i++;
		}while(i <= 100);
		System.out.println(sum1);

	}

}
