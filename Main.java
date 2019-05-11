public class Main{
    public static void main(String[] args){
	//1から100までの整数を,で連結、その後,で分割して配列aに格納
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<100; i++){
	    sb.append(i+1).append(",");
	}
	String s = toString(sb);
	String[] a = s.split("[,:]");

    }

    //folderとfileを連結してfolder\fileという文字列を返す
    Stirng concatPath(String folder, String file){
	if( !folder.endWith("\\") ){
	    folder += "\\";
	}
	return folder + file;
    }
}
