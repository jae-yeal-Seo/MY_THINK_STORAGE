
public class Rectangle2 implements Comparable{
//	Ŭ���� ���� : � ��ü�� ũ�Ⱑ �� ū�� (���⼭ ũ��� ���ϱ� �����̰�, �� Ŭ���������� "��ü�� ũ�� = ���簢���� ũ��"�� ���ߴ�.)
	private int width;
	private int height;
	
	Rectangle2(int width,int height){
		this.width = width;
		this.height = height;
		System.out.println(this);
	}
//	�������̴�. ���ο� ���θ� �Ű������� ���޹޾� �����ϰ� ���ο� ���θ� ����ϴ� �޼ҵ���� ����Ѵ�..
	public int getArea() {
		return width*height;
	}
//	���̸� ��ȯ�ϴ� �޼ҵ�μ�, �����ڿ��� ���� ���ο� ������ ���̸� �̿��� ���̸� ���Ѵ�.
	@Override
	public String toString() {
		return "Rectangle [ width="+width+", height="+height+"]";
	}
//	�����ڿ� ���� �޼ҵ��, �ش� ��ü�� ����, ���� ���̸� ����Ѵ�.
	public int compareTo(Object other) {
//		��ӹ��� �������̽��� �ִ� �߻�޼ҵ带 �����Ѵ�. �� �޼ҵ�� �������� ������ �� �ȴ�. (�������̽��� ��� �߻�޼ҵ�� ��ӹ����� �����ؾ� �ϱ� ������)
//		�׸��� Object other�� �Ű������� ���������� �Ű������� ��� Ŭ������ �θ��� ObjectŬ������ ���������ν� � Ŭ������ ���ڷ� ���� �� �ְ� �ϱ� �����̴�.
			Rectangle2 newRectangle = (Rectangle2)other;
//			other�� ������ ����Ű�� �ִ� ��ü�� Rectangle2�̱� ������ ����ȯ�� ������ ���̴�.
			if(this.getArea()>newRectangle.getArea())
				return 1;
			else if(this.getArea()==newRectangle.getArea())
				return 0;
			else 
				return -1;
//			�� �޼ҵ忡�� ���� this�� �Ű������� ����� ���θ޼ҵ忡�� �����ϰڴ�. 
	}
	
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(100,30);
		Rectangle2 r2 = new Rectangle2(200,10);
		int check = r1.compareTo(r2);
//		���⼭ r1�� this�� �� ���̰�, r2�� ���ڷμ� newRectangle�� �ȴ�. 
		if(check==1)
			System.out.print(r1+"�� �� Ů�ϴ�.");
//		System.out.print(r1)�� �ϸ� r1�� �޼ҵ� toString�� ȣ��Ǵ� ���� �̿��ؼ� ���� ���� ������.
		else if(check==0)
			System.out.print("ũ�Ⱑ �����ϴ�.");
		else
			System.out.print(r2+"�� �� Ů�ϴ�.");
//		System.out.print(r2)�� �ϸ� r2�� �޼ҵ� toString�� ȣ��Ǵ� ���� �̿��ؼ� ���� ���� ������.
		
	}
}
