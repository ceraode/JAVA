package cn.six;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		//�����ĸ�������
		Dog ououDog = new Dog("ŷŷ",100,0,"ѩ����");
		Dog yayaDog = new Dog("ѾѾ",90,10,"��������");
		Dog meimeiDog = new Dog("����",50,50,"ѩ����");
		Dog feifeiDog = new Dog("�ɷ�",90,90,"��������");
		//����ArrayList���϶��󲢰�4�����������������
		List dogs = new ArrayList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2,feifeiDog);
		//��������й�������
		System.out.println("������"+dogs.size()+"ֻ��");
		//ͨ��������ʾ���ϸ�ֻ������Ϣ
		System.out.println("�ֱ���");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName()+"\t"+dog.getStain());
		}
		
		dogs.remove(0); //������ɾ��
		dogs.remove(feifeiDog);//������ɾ��
		System.out.println("foreach��������");
		for(Object obj : dogs) {
			((Dog)obj).print();
		}
		System.out.println(dogs.size());
		System.out.println("�ж϶����Ƿ����");
		if(dogs.contains(feifeiDog)) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}

}
