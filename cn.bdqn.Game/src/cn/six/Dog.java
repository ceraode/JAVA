package cn.six;

public class Dog extends Pet{
	private String stain;
	
	public String getStain() {
		return stain;
	}
	public void setStain(String stain) {
		this.stain = stain;
	}
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name,int health,int love,String stain) {
		super(name,health,love);
		this.stain = stain;
	}
	public void print () {
		System.out.println("êÇ³ÆÎª"+getName());
	}
}
