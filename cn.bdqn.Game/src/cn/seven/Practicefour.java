package cn.seven;

public class Practicefour extends Thread{
	public void run() {
		 for (int i = 1; i <= 1; i++) {
				 System.out.println("线程名"+Thread.currentThread().getName()+"  优先级"+Thread.currentThread().getPriority());
			
		}
	 }
}
