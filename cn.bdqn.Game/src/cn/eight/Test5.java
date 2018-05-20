package cn.eight;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test5 {

	public static void main(String[] args) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader("D:\\myDoc\\¼ò½é.txt");
			char ch[]= new char[1024];
			sbf = new StringBuffer();
			int length = fr.read(ch);
			
			while((length!=-1)) {
				sbf.append(ch);
				length = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fr!=null) 
					fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
