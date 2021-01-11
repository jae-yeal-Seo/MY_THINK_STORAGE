package ch05;

import java.util.*;
public class BasicReferenced {

	public static void main(String[] args) {
		int money1=10000;
		System.out.print(money1+"->");
		System.out.println(money1);//복제의 개념을 알기위해서. (mon1이 0이 된거지 money1이 0이 된 게 아니다.)
		Money money2=new Money(10000);//파라메터 안에 기초형이 들어가 있으므로 10000이라는 인자는 자동으로 zero(int mon1)이라는 메소드에 들어간다.
		//-->기초형
		System.out.print(money2.getwon()+"->");//money2라는 변수의 설명서(class)의 getwon()이라는 동작(메소드)실행
		zero(money2);//n을 아예 0으로 만들어준다.
		System.out.print(money2.getwon());//n1이 0이 됐으니 getwon()을 실행하면 당연히 0이 나온다.
		//-->참조형
	}
	public static void zero(int mon1) {
		mon1=0;//mon1이 0이 된거지 money1이 0이 된 게 아니다.
	}
	public static void zero(Money d) {//d=money2
		d.n=0;//★d=>money2=>Money의(.)n의 값.
}
}
class Money{//plus랑 다른 클래스여야 한다.
	int n;
	Money(int won){//필드(정보)
		n=won;
	}
	public int getwon(){//동작(메소드)
		return n;
	}
}