package cn.eight;

import java.io.FileInputStream;

public class Testone {

	public static void main(String[] args) {
		private static void readDataFromDisk() throws IOException{
			FileInputStream fis = new FileInputStream("D:\\myDoc\\hello.txt");
			byte[] bytes = new byte[1024];
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data = fis.read(bytes))!=-1) {
				String temp = new String(bytes,0,data);
				sb.append(temp);
				System.out.println("ÓÐÐ§×Ö½Ú"+data);
			}
			System.out.println(sb.toString());
			fis.close();
		}
	}

}
