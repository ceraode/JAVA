package cn.seven;

public class Main {

	public static void main(String[] args) {
		Site sitel = new Site();
		
		Thread t1 = new Thread(sitel);
		t1.setName("1ºÅ´°¿Ú");
		t1.start();
		
		Thread t2 = new Thread(sitel);
		t2.setName("2ºÅ´°¿Ú");
		t2.start();
		
		Thread t3 = new Thread(sitel);
		t3.setName("3ºÅ´°¿Ú");
		t3.start();
	}

}
