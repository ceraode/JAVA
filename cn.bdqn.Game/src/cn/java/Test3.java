package cn.java;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test3 {
	public static Logger logger = Logger.getLogger("");
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入被除数");
		try {
			int num1 = in.nextInt();
			System.out.println("请输入除数");
			int num2 = in.nextInt();
			System.out.println(String.format("%d/%d=%d",num1,num2,num1/num2));
			System.out.println("感谢使用此程序");
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("例3");
			System.err.println("出现错误");
			e.printStackTrace();
		}
	}
}
