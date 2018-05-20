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
		System.out.println("请输入被除数");
		try {
			int num1 = in.nextInt();
			
			//logger.debug("输入被除数");
			System.out.println("请输入除数");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
		}catch(InputMismatchException e) {
			System.out.println("被除数和除数必须是整数");
		}catch(ArithmeticException e) {
			System.out.println("除数不能为零");
		}catch (Exception e) {
			System.err.println("未知错误");
		}finally {
			System.out.println("感谢使用此程序");
		}
	}
}
