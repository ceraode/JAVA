package cn.seven;

public class Practice3 {

	public static void main(String[] args) {
		Practicethree young = new Practicethree("年轻人",500,1);
		Practicethree old = new Practicethree("老人",1500,1);
		System.out.println("开始爬山");
		young.start();
		old.start();
	}

}
