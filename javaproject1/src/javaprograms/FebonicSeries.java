package javaprograms;

public class FebonicSeries {
	public static void main(String[] args) {
		int a=0;int b=1;
		
		int series=10;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=series-2;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
	}

}
