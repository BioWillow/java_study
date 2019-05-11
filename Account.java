public class Account{
    String accountNo;

    public boolean equals(Object o){
	//自身が引数なら無条件でtrue
	if(o == this) return true;
	//nullが引数なら無条件でfalse
	if(o == null) return false;
	//比較して型が異なるならfalse,同じならキャスト
	if(!(o instanceof Account)) return false;
	Account r = (Account) o;
	//フィールドを比較して等価か判定する
	if(!this.accountNo.trim().equals(r.accountNo.trim())){
	    return false;
	}
	return true;
    }
}