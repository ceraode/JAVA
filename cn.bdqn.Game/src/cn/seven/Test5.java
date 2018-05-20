package cn.seven;

public class Test5 {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1;i<=50;i++) {
					System.out.println("线程A"+i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					System.out.println("线程B"+i);
					if (i==1) {
						try {
							t1.join();
						} catch (InternalError e) {
							// TODO: handle exception
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		t1.start();
		t2.start();
	}

}
