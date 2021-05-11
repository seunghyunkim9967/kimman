package prac3;

public class JspForm {

	
	/*
	 * 폼에는 액션과 메소드 -> 메소드 설정을 안할경우 디폴트 get doGet Form 태그에 입력한 데이터가 웹 브라우저 URL에 노출되어
	 * 웹 서버로 전송 보안에 약하다
	 * http://localhost9090/member/mypage?member_name=kim+seunghyun&member_Pw=1234&
	 * .... 텍스트가 나열될 수 있는 길이의 한계가 있다.
	 * 
	 * 
	 * doPost form 태그에 입력한 데이터가 http request에 포함되어 웹 서버로 전송 이 때 사용자의 데이터가 헤더파일에 암호화
	 * 되어서 전송된다 맵핑 정보만 노출 되기때문에 보안에 강하다
	 * 
	 * 폼태그를 사용하면 태그안의 데이터들을 submit 할 때 action에 정의한 이름 매핑해놓은 곳으로 찾아간다.
	 * 
	 * 서버쪽에서 사용자가 입력한 정보를 받을 때 request 객체안에 정보가 다있다 request.getParameter -> 어떠한 값
	 * 하나만 뽑아낼 때 파라메터를 쓴다 태그 안의 name=memberName , name=Email .... 등 하나의 파라메터 값을 뽑아내서
	 * 변수에 넣어주고 그 변수를 가지고 어디 넣어주고 가져다 쓰고 ! 여러개의 데이터를 받아야 한다 String[] 변수명 =
	 * request.getParameterValues("네임명"); 이런식으로 배열로 한번에 받을 수도 있다!
	 */
}
