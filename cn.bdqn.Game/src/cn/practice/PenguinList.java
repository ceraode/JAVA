package cn.practice;

import java.util.ArrayList;
import java.util.List;

public class PenguinList {

	public static void main(String[] args) {
		Penguin p1 = new Penguin("��",50,50);
		Penguin p2 = new Penguin("��",10,10);
		Penguin p3 = new Penguin("��",90,90);
		Penguin p4 = new Penguin("��",40,60);
		
		List pg = new ArrayList();
		pg.add(p1);
		pg.add(p2);
		pg.add(p3);
		pg.add(p4);
		
		//������ʾ
		for (int i = 0; i < pg.size(); i++) {
			Penguin p = (Penguin) pg.get(i);
			System.out.println(p.getName()+" ������"+p.getHealth()+" ��Ϥ��"+p.getLove());
		}
		
		//ɾ��
		System.out.println("ɾ����");
		pg.remove(3);
		for (int i = 0; i < pg.size(); i++) {
			Penguin p = (Penguin) pg.get(i);
			System.out.println(p.getName()+" ������"+p.getHealth()+" ��Ϥ��"+p.getLove());
		}
		
		//�ж�
		System.out.println("�ж�");
		if (pg.contains(p4)) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
	}

}
