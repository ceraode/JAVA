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
				System.out.println("文件已创建");
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
				System.out.println("名称"+file.getName());
				System.out.println("相对路径"+file.getPath());
				System.out.println("绝对路径"+file.getAbsolutePath());
				System.out.println("文件大小"+file.length()+"字节");
			}
			if (file.isDirectory()) {
				System.out.println("此文件是目录");
			}
		}else {
			System.out.println("文件不存在");
		}
	}
	private void delete(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			file.delete();
			System.out.println("文件已删除");
		}
	}
}
