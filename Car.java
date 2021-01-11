package ch05;

public class Car{
	private String model;
	public Car(String model){
		this.model=model;
	}


public boolean equals(Object obj){//Object obj�� �س��� ������ ��� ��ü���������� �ϴ� ���� �� �ְ� �س��� �� �̴�.
	if(obj instanceof Car)//obj instanceof Car�� �ǹ� : obj�� ����Ű�� "��ü"�� Car�̰ų� Car�� �ڼ��̳�
		return model.equals(((Car) obj).model);//���� �׷��ٸ� Car�� ����ȯ�� ���ְڴ�(�ڼ��� �θ𺸴� ���԰��谡 ũ�ϱ�         
	// ��������)model�� ����Ű�� �ּҿ� (Car)obj.model�� ����Ű�� �ּҴ� ���� ���ۿ� ����. 
	else
		return false;
}
public static void main(String[] args){
	Car firstCar = new Car("HMW520");
	Car secondCar = new Car("HMW520");
			if(firstCar.equals(secondCar)){
				System.out.println("������ ������ �ڵ����Դϴ�.");
			}
			else {
				System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
			}
}
}


