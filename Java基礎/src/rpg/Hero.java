//主人公
package rpg;

public class Hero {

	/*public static void main(String[] args) {

	}*/
	
	private String name; //主人公の名前
	private int attac; //攻撃力
	private int hp; //体力
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttac() {
		return attac;
	}
	public void setAttac(int attac) {
		this.attac = attac;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
