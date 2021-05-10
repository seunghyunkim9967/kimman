package prac;

public class Grandeur {

	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { //생성자
		System.out.println("Grandeur constructor");
	}
	// public,private,static 접근제한자 void -> 나는 반환할 값이 없어요 
	//public String -> 반환할 값이 문자열이에요 int -> 반환값이 정수형 이에요~ array -> 배열이에요
	public void run() {
		System.out.println("-- run() --");
	}
	
	public void stop() {
		System.out.println("-- stop() --");
	}
	//public void getInfo() { 라면
	//public <- 접근자
	//void <- 반환 형
	//getInfo 메서드 이름
	//() 메개변수 (String s,int i) 
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	//메서드명을 지을 때 가독성을 높이고 다른 사람도 알아보기 쉽게 
	// 동사를 앞에 두고 그 뒤에 동사에 해당하는 목적어나 명사를 두는것이 관례
//	메서드 선언 -> public void getInfo(int i ,String s 매개변수(parameter)는 필요시에만 정의. 자료형과 변수(지역변수)로 이루어진다.) {
//	-> 메서드 정의		System.out.println(" i = " + i);
//					System.out.println(" s  : " + s);
//	
//	}
}
