package cn.six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Day05 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "01");
		map.put("2", "02");
		map.put("3", "03");
		
		System.out.println("Í¨¹ýentry±éÀú");
		for (Map.Entry<String,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		Iterator<String> iterValue = map.values().iterator();
		while (iterValue.hasNext()) {
			String value = iterValue.next();
			System.out.println(value);
			
		}
	}

}
