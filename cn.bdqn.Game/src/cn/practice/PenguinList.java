package cn.practice;

import java.util.ArrayList;
import java.util.List;

public class PenguinList {

	public static void main(String[] args) {
		Penguin p1 = new Penguin("¶«",50,50);
		Penguin p2 = new Penguin("Î÷",10,10);
		Penguin p3 = new Penguin("ÄÏ",90,90);
		Penguin p4 = new Penguin("±±",40,60);
		
		List pg = new ArrayList();
		pg.add(p1);
		pg.add(p2);
		pg.add(p3);
		pg.add(p4);
		
		//±éÀúÏÔÊ¾
		for (int i = 0; i < pg.size(); i++) {
			Penguin p = (Penguin) pg.get(i);
			System.out.println(p.getName()+" ½¡¿µ£º"+p.getHealth()+" ÊìÏ¤£º"+p.getLove());
		}
		
		//É¾³ı
		System.out.println("É¾³ıºó");
		pg.remove(3);
		for (int i = 0; i < pg.size(); i++) {
			Penguin p = (Penguin) pg.get(i);
			System.out.println(p.getName()+" ½¡¿µ£º"+p.getHealth()+" ÊìÏ¤£º"+p.getLove());
		}
		
		//ÅĞ¶Ï
		System.out.println("ÅĞ¶Ï");
		if (pg.contains(p4)) {
			System.out.println("ÓĞ");
		}else {
			System.out.println("ÎŞ");
		}
	}

}
