package javaprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DupliateNumberInArray {
	public static void main(String[] args) {
		int [] a= {1,2,2,5,10,15,15};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					count++;
					break;
				}
					
				
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
		
	}

}
