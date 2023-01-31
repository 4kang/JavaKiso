package progete;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("ディルック","ラグウィンド",27,1.8,68.0);
		person1.printData();
		
		Person person2 = new Person("ガイア","アルベルヒ",26,1.8,64.0);
		person2.printData();
		
		Person.printCount();

	}

}
