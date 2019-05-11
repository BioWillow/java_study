import java.util.*;
public class Main{
    public static void main(String[] args){
	//次の情報を格納する適切なコレクションをList,Set,Mapから選択
	/*
	  (1)日本の47都道府県の名前
	  (2)5人の生徒のテストの点数
	  (3)過去の総理大臣の名前と任期
	 */
	/*
	  (1)List
	  (2)Set
	  (3)Map
	 */

	//斎藤,鈴木をHeroクラスからインスタンス化してArrayListに格納して順番に取り出す
	/*
	Hero h1 = new Hero("斎藤");
	Hero h2 = new Hero("鈴木");
	List<Hero> heros = new ArrayList<Hero>();
	heros.add(h1);
	heros.add(h2);
	for(Hero h : heros){
	    System.out.println(h.getName());
	}
	*/

	//斎藤、鈴木をインスタンス化して倒した敵の数とペアでコレクションに格納して取り出す
	Hero h1 = new Hero("斎藤");
	Hero h2 = new Hero("鈴木");
	Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
	heros.put(h1,3);
	heros.put(h2,7);
	for(Hero key : heros.keySet()){
	    int value = heros.get(key);
	    System.out.println(key.getName() + "が倒した敵=" + value);
	}
    }
}
