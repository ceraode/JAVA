package cn.seven;

public class Test4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(),"线程A");
		Thread t2 = new Thread(new MyRunnable(),"线程B");
		t1.start();
		t2.start();
	}

}
