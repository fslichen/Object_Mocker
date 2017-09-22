package evolution;

import org.junit.Test;

import evolution.method.AnyClass;
import evolution.pojo.AlphaPojo;
import evolution.pojo.AnotherPojo;
import evolution.pojo.AnyPojo;

public class Run {
	private ObjectMocker mocker = new ObjectMocker();
	
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
	
	@Test
	public void testMockObject0() throws Exception {
		AlphaPojo alphaPojo = mocker.mockObject(AlphaPojo.class);
		System.out.println(alphaPojo);
	}
}
