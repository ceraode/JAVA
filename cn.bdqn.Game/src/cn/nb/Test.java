package cn.nb;

public class Test {

	public static void main(String[] args) {
		//��Ա�ڲ���
		Nbl.Time t = new Nbl().new Time();
		t.time();
		Nbl.Time.Age a= new Nbl().new Time().new Age();
		a.age();
		Nbl.Time.Age.Name n= new Nbl().new Time().new Age().new Name();
		n.name();
		
		//�ֲ��ڲ���
		Nbl n1 = new Nbl();
		n1.eat("ը��");
		
		//��̬�ڲ���
		Nbl.Cat c = new Nbl.Cat();
		c.show();
		
		Nbl.Cat.show();
	}

}
