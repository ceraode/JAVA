package cn.java;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test4 {
	public static Logger logger = Logger.getLogger("");
	public static void main(String[] args) {
		logger.info("��4");
		Scanner in = new Scanner(System.in);
		System.out.println("�����뱻����");
		try {
			int num1 = in.nextInt();
			System.out.println("���������");
			int num2 = in.nextInt();
			System.out.println(String.format("%d/%d=%d",num1,num2,num1/num2));
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("���ִ���");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("��лʹ�ô˳���");
		}
	}
}
