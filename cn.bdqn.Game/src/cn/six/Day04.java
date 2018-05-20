package cn.six;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("CN", "�й�");
		map.put("USA", "����");
		map.put("UK", "��������");
		map.put("JP", "�ձ�");
		
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			System.out.println(key+"===");
			String country = map.get(key);
			System.out.println(country);
		}
		
		String country = map.get("USA");
		System.out.println(country);
		
		map.remove("USA");
	}

}
