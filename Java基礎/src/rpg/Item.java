//アイテム
package rpg;

public class Item {
	private String name; //アイテム名
	private int count;//アイテム数
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count=count;
	}

}
