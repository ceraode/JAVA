package cn.nb;

public class Nbl {
	
	//��Ա�ڲ���
		class Time{
			public void time() {
				System.out.println("��������Ҫ��");
			}
			class Age{
				public void age() {
					System.out.println("ʱ�䲻����");
				}
				class Name{
					public void name() {
						System.out.println("������վ");
					}
				}
			}
		}
		
	//�ֲ��ڲ���
	public void eat(String food) {
		class Dog{
			public void show() {
				System.out.println(food);
			}
		}
		new Dog().show();
	}
	
	//��̬�ڲ���
	public static void cat() {
		System.out.println("�ӷ�è");
	}
	static class Cat{
		public static void show() {
			cat();
		}
	}
}
