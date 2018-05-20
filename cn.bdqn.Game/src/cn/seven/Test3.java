package cn.seven;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("-------主线程开始休眠-------");
		Wait.bySec(5);
		System.out.println("休眠结束");
	}

}
