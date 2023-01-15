package test3;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		//ArrayListクラスを使う際はインポートする必要がある
		List<String> list = new ArrayList<>();
		
		list.add("炎の剣");
		list.add("普通の防具");
		list.add("回復薬");
		
		System.out.println(list);

	}

}
