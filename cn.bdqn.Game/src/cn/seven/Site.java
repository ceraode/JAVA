package cn.seven;

public class Site implements Runnable {
	private int count = 10;
	private int num = 0;
	public void run() {
		while (count>0) {
			synchronized (this) {
				if (count<=0) {
					break;
				}
				count--;
				num++;
				System.out.println("线程"+Thread.currentThread().getName()+"正在销售第"+num+"张票,剩余"+count+"张");
			}
		}
	}
}
