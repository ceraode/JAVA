package cn.java;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test5 {
	public static Logger logger = Logger.getLogger("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("��5");
		Scanner in = new Scanner(System.in);
		System.out.println("�����뱻����");
		try {
			int num1 = in.nextInt();
			System.out.println("���������");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
			return;
		} catch (Exception e) {
			System.err.println("���ִ���");
			return;
		}finally {
			System.out.println("��лʹ�ô˳���");
		}
	}

}
