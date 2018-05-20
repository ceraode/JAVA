package cn.eight;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String str = "王霸胆";
			byte[] words = str.getBytes();
			fos = new FileOutputStream("D:\\\\myDoc\\\\hello.txt",true);
			fos.write(words, 0, words.length);
			System.out.println("已更新");
		} catch (IOException obj) {
			System.out.println("创建文件时出错");
		}
		finally {
			try {
				if (fos!=null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
