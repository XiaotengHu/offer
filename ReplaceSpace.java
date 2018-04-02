package test;

public class ReplaceSpace {
	public String replaceSpace(StringBuffer str){
		if(str == null){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <= str.length()-1;i++){
			if(String.valueOf(str.charAt(i)).equals(" ")){
				sb.append("%20");
			}else{
				sb.append(str.charAt(i));
			}
		}
		return String.valueOf(sb);
	}
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We Are Happy");
		ReplaceSpace rs = new ReplaceSpace();
		String result = rs.replaceSpace(str);
		System.out.println(result);
	}

}
