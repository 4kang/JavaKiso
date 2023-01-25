package progete;

public class Instance {

	public static void main(String[] args) {
		//Characterインスタンスを変数に代入する
		Character chara1 = new Character();
		Character chara2 = new Character();
		
		chara1.name = "鈴木"; //"鈴木"という値を代入
		//System.out.println(chara1.name);
		chara1.hello(); //インスタンスメソッドの呼び出し
		
		chara2.name="田中";
		chara2.hello();
		
	}

}
