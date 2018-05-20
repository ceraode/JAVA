package cn.six;

import java.awt.List;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1 = new Dog1();
		d1.setAge(10);
		d1.setName("´ó»Æ");
		
		Dog1 d2 = new Dog1();
		d2.setAge(10);
		d2.setName("´ó»Æ¹·");
		
		Set<Dog1> set = new HashSet<Dog1>();
		set.add(d1);
		set.add(d2);
		System.out.println(set.size());
	}

}
