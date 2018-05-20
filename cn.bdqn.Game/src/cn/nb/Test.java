package cn.nb;

public class Test {

	public static void main(String[] args) {
		//成员内部类
		Nbl.Time t = new Nbl().new Time();
		t.time();
		Nbl.Time.Age a= new Nbl().new Time().new Age();
		a.age();
		Nbl.Time.Age.Name n= new Nbl().new Time().new Age().new Name();
		n.name();
		
		//局部内部类
		Nbl n1 = new Nbl();
		n1.eat("炸鸡");
		
		//静态内部类
		Nbl.Cat c = new Nbl.Cat();
		c.show();
		
		Nbl.Cat.show();
	}

}
