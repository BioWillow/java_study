public class Hero implements Cloneable{
    private String name;
    private int hp;
    private Sword sword;

    //コンストラクタ
    Hero(String name, int hp){
	this.name = name;
	this.hp = hp;
    }
    Hero(String name){
	this(name, 100);
    }
    Hero(){
	this("NoName",100);
    }

    public String getName(){ return this.name; }

    //toStringのオーバーライド
    public String toString(){
	return "勇者" + this.name + "/HP" + this.hp;
    }

    //hashCodeのオーバーライド
    public int hashCode(){
	int result = 37;
	result = result * 31 + name.hashCode();
	result = result * 31 + hp;
	return result;
    }

    //cloneメソッドの実装
    public Hero clone(){
	Hero result = new Hero();
	result.name = this.name;
	result.hp = this.hp;
	result.sword = this.sword;
	return result;
    }

    //setter,getter
    public int getHp(){ return this.hp; }
    public void setHp(int hp){ this.hp = hp; }
    public Sword getSword(){ return this.sword; }
    public void setSword(Sword sword){ this.sword = sword; }
}