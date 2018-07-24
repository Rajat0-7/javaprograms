package javaprograms;

import java.util.Scanner;

interface Google{
	 void Search(String str);
}
class Image implements  Google{
public	void Search(String str){
		System.out.println("execute image"); 
		
	}
	
}
class  News implements Google{
	public void Search(String str) {
	System.out.println("execute news");
	}
}
class Map implements Google{
	public void Search(String str) {
		System.out.println("execute Maps");
	}
}
public class Polymerphismex {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the var");
		String var=s.next();
		Google g1 = null;
		if(var.equals("images")) {
			g1=new Image();
	}
		else if(var.equals("news")) {
			g1=new News();
		}
		else if(var.equals("maps")) {
			g1= new Map();
		}
g1.Search("Sachin");
}
}