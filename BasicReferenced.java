package ch05;

import java.util.*;
public class BasicReferenced {

	public static void main(String[] args) {
		int money1=10000;
		System.out.print(money1+"->");
		System.out.println(money1);//������ ������ �˱����ؼ�. (mon1�� 0�� �Ȱ��� money1�� 0�� �� �� �ƴϴ�.)
		Money money2=new Money(10000);//�Ķ���� �ȿ� �������� �� �����Ƿ� 10000�̶�� ���ڴ� �ڵ����� zero(int mon1)�̶�� �޼ҵ忡 ����.
		//-->������
		System.out.print(money2.getwon()+"->");//money2��� ������ ����(class)�� getwon()�̶�� ����(�޼ҵ�)����
		zero(money2);//n�� �ƿ� 0���� ������ش�.
		System.out.print(money2.getwon());//n1�� 0�� ������ getwon()�� �����ϸ� �翬�� 0�� ���´�.
		//-->������
	}
	public static void zero(int mon1) {
		mon1=0;//mon1�� 0�� �Ȱ��� money1�� 0�� �� �� �ƴϴ�.
	}
	public static void zero(Money d) {//d=money2
		d.n=0;//��d=>money2=>Money��(.)n�� ��.
}
}
class Money{//plus�� �ٸ� Ŭ�������� �Ѵ�.
	int n;
	Money(int won){//�ʵ�(����)
		n=won;
	}
	public int getwon(){//����(�޼ҵ�)
		return n;
	}
}