package javaprograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=7;
		int count=0;
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				System.out.println("not prime");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
	}

}
