package prac;

public class Grandeur {

	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { //������
		System.out.println("Grandeur constructor");
	}
	// public,private,static ���������� void -> ���� ��ȯ�� ���� ����� 
	//public String -> ��ȯ�� ���� ���ڿ��̿��� int -> ��ȯ���� ������ �̿���~ array -> �迭�̿���
	public void run() {
		System.out.println("-- run() --");
	}
	
	public void stop() {
		System.out.println("-- stop() --");
	}
	//public void getInfo() { ���
	//public <- ������
	//void <- ��ȯ ��
	//getInfo �޼��� �̸�
	//() �ް����� (String s,int i) 
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	//�޼������ ���� �� �������� ���̰� �ٸ� ����� �˾ƺ��� ���� 
	// ���縦 �տ� �ΰ� �� �ڿ� ���翡 �ش��ϴ� ����� ��縦 �δ°��� ����
//	�޼��� ���� -> public void getInfo(int i ,String s �Ű�����(parameter)�� �ʿ�ÿ��� ����. �ڷ����� ����(��������)�� �̷������.) {
//	-> �޼��� ����		System.out.println(" i = " + i);
//					System.out.println(" s  : " + s);
//	
//	}
}
