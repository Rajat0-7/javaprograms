package javaprograms;

public class ReverseAnArrayStore {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		int [] b=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k++]=a[i];
		}
		for (int j : b) {
			System.out.println(j);
		}
	}

}
