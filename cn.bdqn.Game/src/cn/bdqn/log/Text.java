package cn.bdqn.log;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Text {
	
	public static Logger logger = Logger.getLogger("");
	public static void main(String[] args) {
		
		logger.info("dfg");
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�����뱻����");
		try {
			int num1 = in.nextInt();
			
			//logger.debug("���뱻����");
			System.out.println("���������");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
		}catch(InputMismatchException e) {
			System.out.println("�������ͳ�������������");
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ��");
		}catch (Exception e) {
			System.err.println("δ֪����");
		}finally {
			System.out.println("��лʹ�ô˳���");
		}
	}
}
