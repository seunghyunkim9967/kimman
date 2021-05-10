package prac;

public class Run {

	public static void main(String[] args) {
		
		//Grandeur.java의 생성자를 호출
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		//Grandeur.java의 생성자를 호출
				Grandeur myCar2 = new Grandeur();
				myCar2.color = "yellow";
				myCar2.gear = "manual";
				myCar2.price = 1000;
				
				myCar2.run();
				myCar2.stop();
				myCar2.info();
		
		
		
	}
	
//	Grandeur 를 외부에서 호출
//	클래스     클래스 명 
//	Grandeur myCar1 = new Grandeur();
//	클래스명  -> . 루트접근자 ->해당하는 메서드 이름을 호출해서 기능을 실행
//	myCar1.

}
