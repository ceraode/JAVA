package cn.eight;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		File file = new File("F:\\MrGuo\\Documents\\JAVAOOP.docx");
		t1.showFileInfo(file);
	}

	private void showFileInfo(File file) {
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
			System.out.println("���ļ�������");
		}
	}

}
