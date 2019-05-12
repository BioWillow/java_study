import java.util.*;
public class Book implements Comparabale<Book>,Cloneabale{
    private String title;
    private Date publishDate;
    private String comment;

    public int hashCode(){
	int result = 1;
	result = result * 31 + title.hashCode();
	result = result * 31 + publishDate.hashCode();
	return result;
    }
    public boolean equals(Object o){
	if(o == this) return true;
	if(o == null) return false;
	if(!(o instanceof Book)) return false;
	Book r = (Book) o;
	if(!this.title.trim().equals(r.title.trim())){
	    return false;
	}
	if(!this.publishDate.trim().equals(r.publishDate.trim())){
		return false;
	}
	return true;
    }
    public int compareTo(Book obj){
	return this.publishDate.compareTo(obj.publishDate);
    }
    public Book clone(){
	Book result = new Book();
	result.title = this.title;
	result.publishDate = this.publishDate;
	result.comment = this.comment();
	return result;
}