package evolution;

import org.junit.Test;

import evolution.pojo.AnyPojo;

public class Run {
	@Test
	public void test() throws Exception {
		Mocker mocker = new Mocker();
		AnyPojo anyPojo = mocker.mockObject(AnyPojo.class);
		System.out.println(anyPojo);
	}
}
