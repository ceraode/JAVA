package cn.seven;

public class Practiceone extends Thread{
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("�����߳�"+Thread.currentThread().getName()+":"+i);
		}
	}
}
