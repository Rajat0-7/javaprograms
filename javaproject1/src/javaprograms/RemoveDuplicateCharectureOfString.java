package javaprograms;

public class RemoveDuplicateCharectureOfString {
	public static void main(String[] args) {
		String str1="JAVAASST";
		String str2=" ";
		for(int i=0;i<=str1.length()-1;i++) {
			int count=0;
			for(int j=0;j<=str2.length()-1;j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
					break;
				}
			}
		if(count==0) {
			str2=str2+str1.charAt(i);
		}   
		}
		System.out.println(str2);
	}

}
