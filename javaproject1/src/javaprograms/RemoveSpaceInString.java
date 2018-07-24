package javaprograms;

public class RemoveSpaceInString {
	public static void main(String[] args) {
		String str1="  I have a beutiful  Grilfrind  ";
		String str2=" ";
		for(int i=0;i<=str1.length()-1;i++) {
			char ch=str1.charAt(i);
			if(ch!=' ') {
				str2=str2+ch;
			}
		}
		System.out.println("string is "+str2);
	}

}
   