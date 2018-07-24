package javaprograms;

public class CountSpace {
	public static void main(String[] args) {
		String str1="  WE   ARE  ENJOYING    ";
		int count=0;
		for(int i=0;i<=str1.length()-1;i++) {
			char ch=str1.charAt(i);
			if(ch==' ') {
				count++;
			}
			
		}
		System.out.println("number of space is "+count);
	}


}
