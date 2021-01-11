package ch05;
public class Constructor{
	private int counter;//필드는 private으로 한다.
	protected Constructor(int counter){//매개변수가 있는 생성자를 만들었다.
		this.counter=counter;
	}
	int get() {//get메소드가 있기 때문에 필드에 있는 변수counter를 private으로 설정할 수 있다.
		return this.counter;
	}
}


class MyCounterTest {

	public static void main(String[] args) {
		
			Constructor mc1=new Constructor(100);//생성자의 역할 : 객체를 만듦과 동시에 객체의 변수를 초기화한다.
			Constructor mc2=new Constructor(200);
			System.out.println("mc1의 카운터 번호는"+mc1.get()+"입니다.");//get메소드(접근자)를 통해 필드값을 호출하였다.(캡슐화)
			System.out.print("mc2의 카운터 번호는"+mc2.get()+"입니다.");

	}
}




