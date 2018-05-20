package cn.seven;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		MyThread thread1 = new MyThread();
		thread.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread.start();
		thread1.start();
	}

}
