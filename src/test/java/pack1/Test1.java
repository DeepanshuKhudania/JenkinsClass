package pack1;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test (groups = {"regression","smoke"})
	public void test() {
		System.out.println("hello world 11");
		String url = System.getProperty("url", "https://www.facebook.com/");
		String browser = System.getProperty("browser	", "chrome");
		//String username = System.getProperty(null);
		//String password	= System.getProperty(null);
		System.out.println(url);
		System.out.println(browser);
	
		
	}
	
	@Test (groups= "regression")
	public void test2() {
		System.out.println("hello word 22");
	}
}
