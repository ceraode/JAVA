package cn.happy.day07;
/**
 * 打印机案例
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//两个线程，一个线程拼命打印 “微冷的雨 ”
        //另外一个线程 拼命打印  “好人”
        //出现串位情况，如何解决？？？？  如果是你，你可以能要想  同步代码块 
		
		Printer printer=new Printer();
		
		
		MyThread t1=new MyThread();
		t1.printer=printer;
		t1.start();
		
		
		MyThreadTwo t2=new MyThreadTwo();
		t2.printer=printer;
		t2.start();
		
		
		
		
		
		
	}

}
