package evolution.method;

import evolution.pojo.AnotherPojo;
import evolution.pojo.AnyPojo;

public class AnyClass {
	public String anyMethod(AnyPojo anyDto, AnotherPojo anotherDto) {
		return anyDto.getName() + anotherDto.getAddress();
	}
}
