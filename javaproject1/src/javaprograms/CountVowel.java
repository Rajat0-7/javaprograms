package javaprograms;

public class CountVowel {
	public static void main(String[] args) {
		String str1="Life is Beautiful";
		int count=0;
		str1=str1.toLowerCase();
		for(int i=0;i<=str1.length()-1;i++) {
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("the number of vowel is :"+count);
	}

}
