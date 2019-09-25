public class Account implements Comparable<Account>{
    private int number;
    private String accountNo;
    private int balance;
    private AccountType accountType;

    public Account(String aNo, AccountType aType){
	this.accountNo = aNo;
	this.accountType = aType;
    }

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

    //sortするときの並び替えを補助する
    public int compareTo(Account obj){
	if(this.number < obj.number){
	    return -1;
	}
	if(this.number > obj.number){
	    return 1;
	}
	return 0;
    }
}