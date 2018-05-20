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
				System.out.println("名称"+file.getName());
				System.out.println("相对路径"+file.getPath());
				System.out.println("绝对路径"+file.getAbsolutePath());
				System.out.println("文件大小"+file.length()+"字节");
			}
			if (file.isDirectory()) {
				System.out.println("此文件是目录");
			}
		}else {
			System.out.println("此文件不存在");
		}
	}

}
