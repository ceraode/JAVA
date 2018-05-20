package cn.six;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		String s ="key";
		map.put(s, "Hello");
		map.put(s, "World");
		System.out.println(map.size());
	}

}