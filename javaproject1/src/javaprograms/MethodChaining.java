package javaprograms;

class FireFox{
	WebElement find(){
		System.out.println("element");
		WebElement W1=new WebElement();
		return W1;
		
	}
}
class WebElement{
	public void SendKey() 
	{
		System.out.println("snd the key");
	}
	public void click() {
		System.out.println("click the buttom");
	}
	
}

public class MethodChaining {
	
	public static void main(String[] args) {
		
		FireFox ff=new FireFox();
		WebElement dr=ff.find();
		dr.SendKey();
		dr.click();
		
		
	}

}
