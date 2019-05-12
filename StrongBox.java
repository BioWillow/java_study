public class StrongBox<E>{
    private E item;
    private KeyType keyType;
    private long count;
    public E get(){
	this.count++;
	switch(this.keyType){
	case PADLOCK:
	    if(count < 1024)return null;
		break;
	case BUTTON:
	    if(count < 10000)return null;
		break;
	case DIAL:
	    if(count < 30000)return null;
		break;
	case FINGER:
	    if(count < 1000000)return null;
		break;
	}
	this.count = 0;

	return this.item;
    }
    public void put(E item){
	this.item = item;
    }

    StrongBox(KeyType key){
	this.keyType = key;
    }
}