public class Hero{
    private String name;
    private int hp;

    Hero(String name, int hp){
	this.name = name;
	this.hp = hp;
    }
    Hero(String name){
	this(name, 100);
    }

    public String getName(){ return this.name; }
    //toStringのオーバーライド
    public String toString(){
	return "勇者" + this.name + "/HP" + this.hp;
    }

}