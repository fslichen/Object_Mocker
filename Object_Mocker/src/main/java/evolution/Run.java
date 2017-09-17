package evolution;

import org.junit.Test;

import evolution.method.AnyClass;
import evolution.pojo.AnotherPojo;
import evolution.pojo.AnyPojo;

public class Run {
	private Mocker mocker = new Mocker();
	
	@Test
	public void testMockObject() throws Exception {
		AnyPojo anyPojo = mocker.mockObject(AnyPojo.class);
		System.out.println(anyPojo);
	}
	
	@Test
	public void testMockMethod() throws NoSuchMethodException, SecurityException, Exception {
		AnyClass anyClass = new AnyClass();
		String result = mocker.mockMethod(AnyClass.class.getMethod("anyMethod", AnyPojo.class, AnotherPojo.class), anyClass);
		System.out.print(result);
	}
}
