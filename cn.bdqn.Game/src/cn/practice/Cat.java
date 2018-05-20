package cn.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String , String> cat = new HashMap<String,String>();
		
		cat.put("bsm", "波斯猫");
		cat.put("jfm", "加菲猫");
		cat.put("zem", "折耳猫");
		cat.put("bem", "布偶猫");
		System.out.println("请输入：");
		String i = in.next();
		System.out.println("是否有"+i+"吗");
		if (cat.containsKey(i)) {
			System.out.println("有");
		}else {
			System.out.println("没有");
		}
	}

}
