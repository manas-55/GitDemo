package myPrac;

public class AdditionToSingleDigit {
	
	public int sum(int num) {
		
		int temp = num;
		int sum = 0;
		while(temp>0) {
			int r = temp%10;
			sum= sum+r;
			temp=temp/10;		
			
		}
		
		return sum;
		
	}
	
	public boolean isSingleDigit(int num) {
		
		int check = num/10;
		if(check==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	int number = 923;
	int finalsum = 923;
	AdditionToSingleDigit in = new AdditionToSingleDigit();
	boolean store = in.isSingleDigit(finalsum); 
	while(in.isSingleDigit(finalsum) == false) {
		finalsum=in.sum(finalsum);
	}
	
	System.out.println(finalsum);
		
		
		
	}
	

}
