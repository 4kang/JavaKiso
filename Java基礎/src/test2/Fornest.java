package test2;

public class Fornest {

	public static void main(String[] args) {
		//forネストで九九を
		for(int x = 1; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				System.out.print(x * y);
				System.out.print("");
			}
			System.out.println();
		}
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < x+1; y++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
		for(int x = 0; x < 10; x++) {
			for(int y = 10;y > x; y--) {
				System.out.print("■");
			}
			System.out.println();
		}
	}

}
