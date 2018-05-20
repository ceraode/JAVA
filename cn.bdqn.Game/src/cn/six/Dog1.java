package cn.six;

public class Dog1 {
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int age;
	@Override
	public int hashCode() {
		int h=63;
		h=31*h+age;
		return h;
	}
	@Override
	public boolean equals(Object obj) {
		Dog1 dd = (Dog1)obj;
		if (dd.getAge()==this.age) {
			return true;
		}else {
			return false;
		}
	}
}
