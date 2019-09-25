//MyFunction型を使えるように
//SAMインタフェースを定義する

public interface MyFunction{
    //格納したい関数と同じ引数と戻り値の抽象メソッドを準備
    public abstract int call(int x,int y);
}