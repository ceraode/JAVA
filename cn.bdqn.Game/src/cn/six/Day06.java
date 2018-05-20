package cn.six;

import java.util.LinkedList;

public class Day06 {
	LinkedList<String> list = new LinkedList<>();
	public void add(String str) {
		list.addFirst(str);
	}
	public void remove() {
		list.removeLast();
	}
	public static void main(String[] args) {
		Day06 test = new Day06();
		test.add("123");
		test.add("456");
		test.add("789");
		
		test.remove();
		for(String value:test.list) {
			System.out.println(value);
		}
	}

}
