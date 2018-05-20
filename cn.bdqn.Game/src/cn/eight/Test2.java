package cn.eight;

import java.io.File;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		File file = new File("F:\\MrGuo\\Documents\\test.txt");
		t2.create(file);
		t2.showFileInfo(file);
		t2.delete(file);
	}

	private void showFileInfo(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���");
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	private void create(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("����"+file.getName());
				System.out.println("���·��"+file.getPath());
				System.out.println("����·��"+file.getAbsolutePath());
				System.out.println("�ļ���С"+file.length()+"�ֽ�");
			}
			if (file.isDirectory()) {
				System.out.println("���ļ���Ŀ¼");
			}
		}else {
			System.out.println("�ļ�������");
		}
	}
	private void delete(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ���ɾ��");
		}
	}
}
