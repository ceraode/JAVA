package cn.happy.day07;
/**
 * ��ӡ������
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//�����̣߳�һ���߳�ƴ����ӡ ��΢����� ��
        //����һ���߳� ƴ����ӡ  �����ˡ�
        //���ִ�λ�������ν����������  ������㣬�������Ҫ��  ͬ������� 
		
		Printer printer=new Printer();
		
		
		MyThread t1=new MyThread();
		t1.printer=printer;
		t1.start();
		
		
		MyThreadTwo t2=new MyThreadTwo();
		t2.printer=printer;
		t2.start();
		
		
		
		
		
		
	}

}
