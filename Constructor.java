package ch05;
public class Constructor{
	private int counter;//�ʵ�� private���� �Ѵ�.
	protected Constructor(int counter){//�Ű������� �ִ� �����ڸ� �������.
		this.counter=counter;
	}
	int get() {//get�޼ҵ尡 �ֱ� ������ �ʵ忡 �ִ� ����counter�� private���� ������ �� �ִ�.
		return this.counter;
	}
}


class MyCounterTest {

	public static void main(String[] args) {
		
			Constructor mc1=new Constructor(100);//�������� ���� : ��ü�� ����� ���ÿ� ��ü�� ������ �ʱ�ȭ�Ѵ�.
			Constructor mc2=new Constructor(200);
			System.out.println("mc1�� ī���� ��ȣ��"+mc1.get()+"�Դϴ�.");//get�޼ҵ�(������)�� ���� �ʵ尪�� ȣ���Ͽ���.(ĸ��ȭ)
			System.out.print("mc2�� ī���� ��ȣ��"+mc2.get()+"�Դϴ�.");

	}
}




