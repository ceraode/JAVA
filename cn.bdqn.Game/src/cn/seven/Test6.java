package cn.seven;

public class Test6 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("�߳�A"+i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("�߳�B"+i);
					if (i==3) {
						System.out.println("�߳�����");
						Thread.yield();
					}
				}
			}
		});
		t2.start();
		t1.start();
	}

}
