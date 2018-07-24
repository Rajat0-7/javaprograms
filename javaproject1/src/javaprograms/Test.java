package javaprograms;
class Test1{
	private int a;
	Test1(){
		a=10;
		System.out.println(a);
	}
	Test1(int i){
		a=i;
		System.out.println(a);
	}
	
}

public class Test {
	public static void main(String[] args) {
		Test1 s=new Test1();
		Test1  s1=new Test1(115);
	    
	}
	

}
