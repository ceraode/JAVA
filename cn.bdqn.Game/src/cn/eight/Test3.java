package cn.eight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		//����������
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\myDoc\\hello.txt");
			int data;
			System.out.println("�ɶ�ȡ���ֽ�����"+fis.available());
			System.out.println("�ļ�����Ϊ:");
			while ((data = fis.read())!=-1) {
				System.out.print((char)data+"");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
