package myPrac;

import java.util.Arrays;

public class FLupperCase {
	
	public static void main(String[] args) {
		
		String str= "this is test";
		String[] div= str.split(" ");
		//System.out.println(Arrays.toString(div));
		str = "";
		int n = div.length;
		
		for(int i=0; i<n; i++) {
			char first=Character.toUpperCase(div[i].charAt(0));
			char last=Character.toUpperCase(div[i].charAt(div[i].length()-1));
			String temp=first+div[i].substring(1, div[i].length()-1)+last;
			div[i]=temp;
			
			str = str+" "+div[i];
		}
		
		System.out.println(str);
		
	}

}
