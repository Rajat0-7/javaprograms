package javaprograms;

public class GivenStringArrangement {
public static void main(String[] args) {
	String str1="QSPIDER";
	for(int i=0;i<=6;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(str1.charAt(j));
		}
		System.out.println();
	}
	
}
}
