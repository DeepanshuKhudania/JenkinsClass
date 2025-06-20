	package pack2;

import org.testng.annotations.Test;

public class Test2 {

	@Test (groups = "regression")
	public void test() {
		System.out.println("hello world 1");
	}
	
	@Test (groups = "regression")
	public void test2() {
		System.out.println("hello word 2");
	}
}
