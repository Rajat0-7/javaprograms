package javaprograms;

class Animal{
	void d1(){
		System.out.println("in d1");
	}
}
class Monkey extends Animal{
	
	void d2() {
		System.out.println("in d2");
	}
}

public class OverPr {
	
	  void m1(Animal an) {
		System.out.println("Animal-args");
	        }
	  void  m1(Monkey am) {
		System.out.println("monkey-args");
	        }
public static void main(String[] args) {
	OverPr Ov=new OverPr();
	Animal a2=new Animal();
	Ov.m1(a2);
	Monkey a3=new Monkey();
	Ov.m1(a3);
	Animal a4=new Monkey();
	Ov.m1(a4);
	
	

	
	
}
}
