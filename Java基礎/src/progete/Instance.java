package progete;

public class Instance {

	public static void main(String[] args) {
		//Characterインスタンスを変数に代入する
		Character chara1 = new Character("黒","白",18,1.7,56.7);
		chara1.printData();
		
		Character chara2 = new Character("赤","白",16,1.52,43.0);
		chara2.printData();
		
		
		//chara1.name = "鈴木"; //"鈴木"という値を代入
		//System.out.println(chara1.name);
		//chara1.hello(); //インスタンスメソッドの呼び出し
		
		//chara2.name="田中";
		//chara2.hello();
		
		
	}

}
