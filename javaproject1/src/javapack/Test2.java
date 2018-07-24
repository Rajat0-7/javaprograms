package javapack;

 class Test2 extends Test1 {
	 public void m2() {
		 System.out.println("in test2");
	 }
	 public static void main(String[] args) {
			Test2 t= new Test2();
			t.m1();
			t.m2();
		}

}
