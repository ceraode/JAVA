package cn.seven;

public class Practice4 {

	public static void main(String[] args) {
		Practicefour pt = new Practicefour();
		
		Practicefour pt1 = new Practicefour();
		pt.setPriority(10);
		System.out.println("���߳�"+Thread.currentThread().getName()+",���ȼ�"+Thread.currentThread().getPriority());
		pt1.setPriority(1);
		System.out.println("���߳�"+Thread.currentThread().getName()+",���ȼ�"+Thread.currentThread().getPriority());
		pt.start();
		pt1.start();
	}

}
