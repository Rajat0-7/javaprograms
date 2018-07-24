package javaprograms;

public class ArrayArrangment {
	public static void main(String[] args) {
		int []  a= {1,2,3};
		char [] b= {'A','B','C'};
		
		for (int i = 0; i <a.length; i++) {
			System.out.println(b[i]);
			System.out.println(a[b.length-i-1]);
		}
	}

}
