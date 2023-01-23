//Main
package rpg;

public class Rpg {

	public static void main(String[] args) {
		Hero shujinko = new Hero();
		
		//set○○で値をセットする
		shujinko.setName("勇者A");
		shujinko.setAttac(20);
		shujinko.setHp(100);
		
		System.out.println("彼の名前は" + shujinko.getName());

	}

}
