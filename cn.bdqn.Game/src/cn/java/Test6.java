package cn.java;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.exit(1);//finallyΨһ��ִ�е����
		}finally {
			System.out.println("��лʹ�ô˳���");
		}
	}
}
