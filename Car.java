package ch05;

public class Car{
	private String model;
	public Car(String model){
		this.model=model;
	}


public boolean equals(Object obj){//Object obj로 해놓은 이유는 어떠한 객체참조변수도 일단 받을 수 있게 해놓은 것 이다.
	if(obj instanceof Car)//obj instanceof Car의 의미 : obj가 가리키는 "객체"가 Car이거나 Car의 자손이냐
		return model.equals(((Car) obj).model);//만약 그렇다면 Car로 형변환을 해주겠다(자손이 부모보다 포함관계가 크니까         
	// 가능한일)model이 가리키는 주소와 (Car)obj.model이 가리키는 주소는 같을 수밖에 없음. 
	else
		return false;
}
public static void main(String[] args){
	Car firstCar = new Car("HMW520");
	Car secondCar = new Car("HMW520");
			if(firstCar.equals(secondCar)){
				System.out.println("동일한 종류의 자동차입니다.");
			}
			else {
				System.out.println("동일한 종류의 자동차가 아닙니다.");
			}
}
}


