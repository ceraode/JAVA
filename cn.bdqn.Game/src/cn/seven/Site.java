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
				System.out.println("�߳�"+Thread.currentThread().getName()+"�������۵�"+num+"��Ʊ,ʣ��"+count+"��");
			}
		}
	}
}
