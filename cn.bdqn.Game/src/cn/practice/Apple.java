package cn.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Apple {

	public static void main(String[] args) {
		AppleTest fushi = new AppleTest("��ʿ",10,8);
		AppleTest qing = new AppleTest("��ƻ��",4,4);
		AppleTest she = new AppleTest("�߹�",8,7);
		AppleTest guoguang = new AppleTest("����",9,5);
		
		List apple = new ArrayList();
		apple.add(fushi);
		apple.add(qing);
		apple.add(she);
		apple.add(guoguang);
		
		System.out.println("�ֱ��ǣ�");
		Iterator its = apple.iterator();
		while (its.hasNext()) {
			AppleTest app = (AppleTest) its.next();
			System.out.println(app.getName()+"\t"+app.getCatty());
		}
	}

}
