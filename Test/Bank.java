//コンパイル、実行時に -cp でパスを通す
import org.apache.commons.lang3.builder.*;

public class Bank{
    String name;
    String address;

    public boolean equals(Object o){
	//全てのフィールドが等価ならインスタンスも等価とみなす機能
	return Equals.reflectionEquals(this,o);
    }
}