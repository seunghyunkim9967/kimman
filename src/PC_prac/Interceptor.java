package PC_prac;

public class Interceptor {

//		servlet-context에 
//		인터셉터를 맵핑해주면 해당 메서드를 실행할 때 예를들어 회원 탈퇴나 수정할때 
//		세션에 값이 null이면 메인페이지로 보내고 
//		값이 있으면 true를 반환
//	리다이렉트를 사용해야 하는 경우가 많을 경우 HandlerInterceptor를 이용할 수 있다.
//	
//	1.Request ->
//	2.DispatcherServlet ->
//	3.preHandle() ->
//	4.Handler(Controller)->
//	5.Handler 에서 postHandle()로
//	6.postHandle() 
//	7. View 
//	8. View ->
//	9. afterCompletion()
//	
//	마지막 Response
//	
}
