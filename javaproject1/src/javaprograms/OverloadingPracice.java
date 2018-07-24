package javaprograms;
class A{
	public void wish() {
		System.out.println("in wish");
	}
}
class B extends A{
	public void wish() {
		System.out.println("out wish");
	}
}

public class OverloadingPracice {
	public static void main(String[] args) {
		A a1=new B();
		a1.wish();
		
		
		
	}
}
