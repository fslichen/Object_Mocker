package evolution.pojo;

import java.util.List;
import java.util.Map;

public class AnyPojo {
	private String name;
	private Integer age;
	private AnotherPojo anotherPojo;
	private List<AnotherPojo> list;
	private Map<String, AnotherPojo> map;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public AnotherPojo getAnotherPojo() {
		return anotherPojo;
	}
	public void setAnotherPojo(AnotherPojo anotherPojo) {
		this.anotherPojo = anotherPojo;
	}
	public List<AnotherPojo> getList() {
		return list;
	}
	public void setList(List<AnotherPojo> list) {
		this.list = list;
	}
	public Map<String, AnotherPojo> getMap() {
		return map;
	}
	public void setMap(Map<String, AnotherPojo> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "AnyPojo [name=" + name + ", age=" + age + ", anotherPojo=" + anotherPojo + ", list=" + list + ", map="
				+ map + "]";
	}
}
