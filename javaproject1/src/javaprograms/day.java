package javaprograms;

import java.util.Arrays;

public class day {
	public static void main(String[] args) {
		int a[]= {10,180,100,120,40,80,600};
		Arrays.sort(a);
		for (int i = 0; i <5; i++) {
			System.out.println("first "+(i+1)+" day to purchase in less price "+a[i]);
		}
		System.out.println();
		for (int i =a.length-5; i<a.length; i++) {
			System.out.println("first "+(i-1)+" day to sell in high price "+a[i]);
		}
		System.out.println();
		for (int i = 0; i <5; i++) {
			System.out.println("first "+(i+1)+" day to purchase in less price "+a[0]);
		}
		System.out.println();
		for (int i =a.length-5; i<a.length; i++) {
			System.out.println("first "+(i-1)+" day to sell in high price "+a[a.length-1]);
		}
		
	}

}
