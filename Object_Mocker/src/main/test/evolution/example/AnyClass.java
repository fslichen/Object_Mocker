package evolution.example;

import java.util.List;
import java.util.Map;

import evolution.example.pojo.AnotherPojo;
import evolution.example.pojo.AnyPojo;

public class AnyClass {
	public String anyMethod(AnyPojo anyDto, AnotherPojo anotherDto) {
		return anyDto.getName() + anotherDto.getAddress();
	}
	
	public List<AnyPojo> anotherMethod(List<AnyPojo> list, Map<String, AnyPojo> map) {
		return null;
	}
}
