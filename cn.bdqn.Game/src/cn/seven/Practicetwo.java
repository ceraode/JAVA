package cn.seven;

public class Practicetwo implements Runnable{
	 public void run() {
		 for (int i = 1; i <= 20; i++) {
			System.out.println("����"+Thread.currentThread().getName()+":"+i);
		}
	 }
}
