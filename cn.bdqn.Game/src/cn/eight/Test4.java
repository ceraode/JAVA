package cn.eight;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String str = "���Ե�";
			byte[] words = str.getBytes();
			fos = new FileOutputStream("D:\\\\myDoc\\\\hello.txt",true);
			fos.write(words, 0, words.length);
			System.out.println("�Ѹ���");
		} catch (IOException obj) {
			System.out.println("�����ļ�ʱ����");
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
