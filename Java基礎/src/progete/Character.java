package progete;

public class Character { //クラス名
	
	public String name; //変数を定義
	
	public void hello() { //helloメソッド名
		
		//thisという変数はメソッドが呼ばれたときに、そのメソッドを呼び出しているインスタンスに置き換えられる
		System.out.println("こんにちは、私は" + this.name + "です");
		
	}
	
	Character(){
		System.out.println("インスタンスが生成されました");
	}

}
