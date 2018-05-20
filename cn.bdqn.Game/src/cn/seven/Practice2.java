package cn.seven;

public class Practice2 {

	public static void main(String[] args) {
		Practicetwo pt = new Practicetwo();
		Thread myThread = new Thread(pt);
		Practicetwo pt1 = new Practicetwo();
		Thread myThread2 = new Thread(pt1);
		myThread.start();
		myThread2.start();
	}

}
