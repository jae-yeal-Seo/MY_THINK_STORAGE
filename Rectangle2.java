
public class Rectangle2 implements Comparable{
//	클래스 설명 : 어떤 객체의 크기가 더 큰지 (여기서 크기란 정하기 나름이고, 이 클래스에서는 "객체의 크기 = 직사각형의 크기"로 정했다.)
	private int width;
	private int height;
	
	Rectangle2(int width,int height){
		this.width = width;
		this.height = height;
		System.out.println(this);
	}
//	생성자이다. 가로와 세로를 매개변수로 전달받아 저장하고 가로와 세로를 출력하는 메소드까지 사용한다..
	public int getArea() {
		return width*height;
	}
//	넓이를 반환하는 메소드로서, 생성자에서 받은 가로와 세로의 길이를 이용해 넓이를 구한다.
	@Override
	public String toString() {
		return "Rectangle [ width="+width+", height="+height+"]";
	}
//	생성자에 쓰일 메소드로, 해당 객체의 가로, 세로 길이를 출력한다.
	public int compareTo(Object other) {
//		상속받은 인터페이스에 있는 추상메소드를 구현한다. 이 메소드는 구현하지 않으면 안 된다. (인터페이스의 모든 추상메소드는 상속받으면 구현해야 하기 때문에)
//		그리고 Object other로 매개변수를 정한이유는 매개변수를 모든 클래스의 부모인 Object클래스로 설정함으로써 어떤 클래스도 인자로 넣을 수 있게 하기 위함이다.
			Rectangle2 newRectangle = (Rectangle2)other;
//			other이 실제로 가리키고 있는 객체가 Rectangle2이기 때문에 형변환이 가능한 것이다.
			if(this.getArea()>newRectangle.getArea())
				return 1;
			else if(this.getArea()==newRectangle.getArea())
				return 0;
			else 
				return -1;
//			이 메소드에서 쓰인 this와 매개변수의 관계는 메인메소드에서 설명하겠다. 
	}
	
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(100,30);
		Rectangle2 r2 = new Rectangle2(200,10);
		int check = r1.compareTo(r2);
//		여기서 r1이 this가 될 것이고, r2는 인자로서 newRectangle이 된다. 
		if(check==1)
			System.out.print(r1+"가 더 큽니다.");
//		System.out.print(r1)을 하면 r1의 메소드 toString이 호출되는 것을 이용해서 위와 같이 적었다.
		else if(check==0)
			System.out.print("크기가 같습니다.");
		else
			System.out.print(r2+"가 더 큽니다.");
//		System.out.print(r2)을 하면 r2의 메소드 toString이 호출되는 것을 이용해서 위와 같이 적었다.
		
	}
}
