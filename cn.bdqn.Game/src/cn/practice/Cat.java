package cn.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String , String> cat = new HashMap<String,String>();
		
		cat.put("bsm", "��˹è");
		cat.put("jfm", "�ӷ�è");
		cat.put("zem", "�۶�è");
		cat.put("bem", "��żè");
		System.out.println("�����룺");
		String i = in.next();
		System.out.println("�Ƿ���"+i+"��");
		if (cat.containsKey(i)) {
			System.out.println("��");
		}else {
			System.out.println("û��");
		}
	}

}
