package cn.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Apple {

	public static void main(String[] args) {
		AppleTest fushi = new AppleTest("富士",10,8);
		AppleTest qing = new AppleTest("青苹果",4,4);
		AppleTest she = new AppleTest("蛇果",8,7);
		AppleTest guoguang = new AppleTest("国光",9,5);
		
		List apple = new ArrayList();
		apple.add(fushi);
		apple.add(qing);
		apple.add(she);
		apple.add(guoguang);
		
		System.out.println("分别是：");
		Iterator its = apple.iterator();
		while (its.hasNext()) {
			AppleTest app = (AppleTest) its.next();
			System.out.println(app.getName()+"\t"+app.getCatty());
		}
	}

}
