package javaprograms;

public class CountEachVowel {
	public static void main(String[] args) {
		int countA=0;
		int countE =0;
		int countI=0;
		int countO =0;
		int countU=0;
		String str1="Life is Beutiful and Joyful";
		str1=str1.toLowerCase();
		for(int i=0;i<=str1.length()-1;i++) {
			char ch=str1.charAt(i);
			if(ch=='a') {
				countA++;
			}
			else if(ch=='e') {
				countE++;
			}
			else if(ch=='i'){
				countI++;
			}
			else if(ch=='o'){
				countO++;
				
			}
			else if(ch=='u')
			{
				countU++;
			}
			
			
			}
			System.out.println("The number of occurance in A is "+countA);
			System.out.println("The number of occurance in E is "+countE);
			System.out.println("The number of occurance in I is "+countI);
			System.out.println("The number of occurance in O is "+countO);
			System.out.println("The number of occurance in U is "+countU);
		} 
		
		
	}


