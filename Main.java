import java.util.function.*;
public class Main{
    public static void main(String[] args){
	//「2つの引数の差を求める処理」の実態を生み出し代入する
	MyFunction func = (int a, int b) -> {return a - b;};
	int a = func.call(5,3);
	System.out.println("5-3="+a);

	double pi = 3.1415;
	MyFunction2 func2 = x -> x * x * pi;
	double b = func2.call(3);
	System.out.println("半径3の円の面積は"+b);
    }
}
