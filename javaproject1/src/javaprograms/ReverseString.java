package javaprograms;

public class ReverseString {
	public static void main(String[] args) {
		String str1 = "Rajat";
		String rev = " ";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		System.out.println(rev);
	}

}
