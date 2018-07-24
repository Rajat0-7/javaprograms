package javaprograms;

public class SumOfNumberWithConditions {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum=0;
		for(int i=1;i<=15;i++) {
			if(i%3==0) {
				sum1=sum1+i*2;
			}
			if(i%5==0) {
				sum2=sum2+i*3;
			}
			if(i%15==0) {
				sum3=sum3+i*4;
			}
			sum4=sum4+i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	
		sum=sum+sum1+sum2+sum3+sum4;
		System.out.println(sum);
	}

}
