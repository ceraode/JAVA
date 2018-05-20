package cn.six;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		//创建四个狗对象
		Dog ououDog = new Dog("欧欧",100,0,"雪纳瑞");
		Dog yayaDog = new Dog("丫丫",90,10,"拉布拉多");
		Dog meimeiDog = new Dog("美美",50,50,"雪纳瑞");
		Dog feifeiDog = new Dog("飞飞",90,90,"拉布拉多");
		//创建ArrayList集合对象并把4个狗狗对象放入其中
		List dogs = new ArrayList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2,feifeiDog);
		//输出集合中狗的数量
		System.out.println("共计有"+dogs.size()+"只狗");
		//通过遍历显示集合各只狗的信息
		System.out.println("分别是");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName()+"\t"+dog.getStain());
		}
		
		dogs.remove(0); //索引号删除
		dogs.remove(feifeiDog);//对象名删除
		System.out.println("foreach方法遍历");
		for(Object obj : dogs) {
			((Dog)obj).print();
		}
		System.out.println(dogs.size());
		System.out.println("判断对象是否存在");
		if(dogs.contains(feifeiDog)) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
	}

}
