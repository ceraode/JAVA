package cn.seven;

public class MyRunnable implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"����,"+i);
			if (i==3) {
				Thread.yield();
				System.out.println("�߳�����");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
