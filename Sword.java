public class Sword implements Cloneable{
    private int damage;
    private String name;

    //コンストラクタ
    Sword(int damage, String name){
	this.damage = damage;
	this.name = name;
    }
    Sword(String name){ this(50,name); }
    Sword(int damage){ this(damage, "ひのきのぼう"); }
    Sword(){ this(50,"ひのきのぼう");}

    //setter,getter
    public int getDamage(){ return this.damage; }
    public void setDamage(int damage){ this.damage = damage; }
    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public Sword clone(){
	Sword result = new Sword();
	result.name = this.name;
	result.damage = this.damage;
	return result;
    }
}