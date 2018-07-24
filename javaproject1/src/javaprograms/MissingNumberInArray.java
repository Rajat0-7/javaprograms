package javaprograms;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 7, 10 };
		for(int i=1;i<=10;i++) {
			int count=0;
			for (int k : a) {
				if(i==k) {
					count++;
					break;
				}
				
			}
			
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}
}
	
		
		
		