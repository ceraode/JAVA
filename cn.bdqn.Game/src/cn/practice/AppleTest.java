package cn.practice;

public class AppleTest {
	public String name;
	public int catty;//ฝ๏
	public int element;//ิช
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCatty() {
		return catty;
	}
	public void setCatty(int catty) {
		this.catty = catty;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public AppleTest() {
		
	}
	public AppleTest(String name,int catty,int element) {
		this.name = name;
		this.catty = catty;
		this.element = element;
	}
}
