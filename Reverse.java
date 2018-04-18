package offer;

public class Reverse {
public static void main(String[] args) {
	String str = "I am a student";
	String strResult = "";
	String[] str1 = str.split(" ");
	String[] strTemp = new String[str1.length]; 
	for(int i =str1.length-1; i>=0; i--){
		 strTemp[str1.length-1-i] = str1[i];
	}
	for(int i=0;i<=str1.length-1;i++){
	     strResult += strTemp[i] + " ";
	     
	}
	System.out.println(strResult);
	
}
}
