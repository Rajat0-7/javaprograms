package javaprograms;
class Tuski{
	Palabi perpose() {
		System.out.println("perposesal");
		Palabi pl=new Palabi();
		return pl;
	}
	
}
class Palabi{
	public void show() {
		System.out.println("show  ");
	}
	public void break1() {
		System.out.println(" break1");
	}
	
}


public class PractiseClass {
	public static void main(String[] args) {
		Tuski t1=new Tuski();
		Palabi p1=null;
	     p1=  t1.perpose(); 
		p1.show();
		p1.break1();
		t1.perpose().break1();
		
		
		  
		
	}
	
	


}
