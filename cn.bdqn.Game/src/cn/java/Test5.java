package cn.java;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test5 {
	public static Logger logger = Logger.getLogger("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("例5");
		Scanner in = new Scanner(System.in);
		System.out.println("请输入被除数");
		try {
			int num1 = in.nextInt();
			System.out.println("请输入除数");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
			return;
		} catch (Exception e) {
			System.err.println("出现错误");
			return;
		}finally {
			System.out.println("感谢使用此程序");
		}
	}

}
