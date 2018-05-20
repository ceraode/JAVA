package cn.seven;

public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("-------线程强制执行");
		Thread temp = new Thread(new MyRun(),"temp");
		temp.start();
		for (int i = 0; i < 20; i++) {
			if (i==5) {
				try {
					temp.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"运行"+i);
			
		}
	}
}
