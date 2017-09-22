package evolution;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import evolution.example.AnyClass;
import evolution.example.pojo.AlphaPojo;
import evolution.example.pojo.AnotherPojo;
import evolution.example.pojo.AnyPojo;

public class ObjectMockerTest {
	private ObjectMocker mocker = new ObjectMocker();
	
	@Test
	public void testMockObject0() throws Exception {
		AnyPojo anyPojo = mocker.mockObject(AnyPojo.class);
		System.out.println(anyPojo);
	}
	
	@Test
	public void testMockObject1() throws Exception {
		AlphaPojo alphaPojo = mocker.mockObject(AlphaPojo.class);
		System.out.println(alphaPojo);
	}
	
	@Test
	public void testMockMethod() throws NoSuchMethodException, SecurityException, Exception {
		AnyClass anyClass = new AnyClass();
		String result = mocker.mockInvokingMethod(AnyClass.class.getMethod("anyMethod", AnyPojo.class, AnotherPojo.class), anyClass);
		System.out.print(result);
	}
	
	@Test
	public void testMockParameterValues() throws Exception {
		Method method = AnyClass.class.getDeclaredMethod("anotherMethod", List.class, Map.class);
		for (Object object : mocker.mockParameterValues(method)) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testMockReturnValue() throws Exception {
		Method method = AnyClass.class.getDeclaredMethod("anotherMethod", List.class, Map.class);
		Object object = mocker.mockReturnValue(method);
		System.out.println(object);
	}
}
