package myPrac;

public class RightRotateString {
	
	public String RightRotate(String str) {
		
		char[] ch = str.toCharArray();
		char last=ch[str.length()-1];
		
		for(int i=ch.length-1;i>0;i--) {
			//char temp= ch[i+1];
			ch[i] = ch[i-1];
						
		}
		
		ch[0]= last;
		str= new String(ch);
		return str;
		
		
	}

	public static void main(String[] args) {
		
		RightRotateString ro = new RightRotateString();
		int num=3;
		String str = "abcde";
		
		for(int i=1;i<=num;i++) {
			str= ro.RightRotate(str);
			System.out.println(str);		
			
		}
	}
	
}
