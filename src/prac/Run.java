package prac;

public class Run {

	public static void main(String[] args) {
		
		//Grandeur.java�� �����ڸ� ȣ��
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		//Grandeur.java�� �����ڸ� ȣ��
				Grandeur myCar2 = new Grandeur();
				myCar2.color = "yellow";
				myCar2.gear = "manual";
				myCar2.price = 1000;
				
				myCar2.run();
				myCar2.stop();
				myCar2.info();
		
		
		
	}
	
//	Grandeur �� �ܺο��� ȣ��
//	Ŭ����     Ŭ���� �� 
//	Grandeur myCar1 = new Grandeur();
//	Ŭ������  -> . ��Ʈ������ ->�ش��ϴ� �޼��� �̸��� ȣ���ؼ� ����� ����
//	myCar1.

}
