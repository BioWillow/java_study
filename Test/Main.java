import java.lang.reflect.*;
public class Main{
    public static void main(String[] args)throws Exception {
	Class<?> clazz = RefSample.class;
	//引数一つのコンストラクタを受け取り、インスタンスを取得する
	Constructor<?> cons = clazz.getConstructor(int.class);
	RefSample rs = (RefSample) cons.newInstance(256);
	//timesフィールドに関するFieldを受けとり読み書き
	Field f = clazz.getField("times");
	f.set(rs,2);
	System.out.println(f.get(rs));
	//引数二つのhelloメソッドを受け取り呼び出す
	Method m = clazz.getMethod("hello",String.class, int.class);
	m.invoke(rs,"reflection!",128);
	//クラスやメソッドへの修飾を調べる
	boolean pubc = Modifier.isPublic(clazz.getModifiers());
	boolean finm = Modifier.isFinal(m.getModifiers());
    }
}
