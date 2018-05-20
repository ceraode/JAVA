package cn.nb;

public class Nbl {
	
	//成员内部类
		class Time{
			public void time() {
				System.out.println("周五有事要做");
			}
			class Age{
				public void age() {
					System.out.println("时间不等人");
				}
				class Name{
					public void name() {
						System.out.println("北京南站");
					}
				}
			}
		}
		
	//局部内部类
	public void eat(String food) {
		class Dog{
			public void show() {
				System.out.println(food);
			}
		}
		new Dog().show();
	}
	
	//静态内部类
	public static void cat() {
		System.out.println("加菲猫");
	}
	static class Cat{
		public static void show() {
			cat();
		}
	}
}
