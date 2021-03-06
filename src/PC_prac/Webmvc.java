/*
 * package PC_prac;
 * 
 * public class Webmvc {
 * 
 * 
 * 
 * 1. java파일 : java파일들이 위치한다. 주로 패키지로 묶어서 관리한다. 웹 애플리 케이션에서 사용되는 Controller,
 * Service, DAO객체들이 위치한다. 2. webapp : 웹과 관련된 파일들(스프링 설정파일, JSP파일, HTML파일 등..)이
 * 위치한다. 3. resources : JSP파일을 제외한 html, css, js파일등이 위치한다. 4. spring폴더 : 스프링
 * 컨테이너를 생성하기 위한 스프링 설정파일이 위치한다. 5. views 폴더 : View로 사용될 JSP파일이 위치한다. 6.
 * pom.xml파일 : 메인 레파지토리에서 프로젝트에 필요한 라이브러리를 내려받 기 위한 메이븐 설정 파일
 * 
 * 
 * 
 * web.xml 웹 어플리케이션에서 최초 사용자의 요청이 발생하면 가장먼저 DispatcherServlet이 사 용자의 요청을 받는다고
 * 하였다. 따라서 개발자는 DispatcherServlet을 서블릿으로 등록 해주는 과정을 설정해 주어야 한다. 그리고 사용자의 모든 요청을
 * 받기 위해서 서블릿 맵핑 경로는 ‘/’로 설정한다
 * 
 * 
 * DispatcherServlet
 * 
 * 사용자의 모든 요청을 DispatcherServlet이 받은 후 HandlerMapping 객체에 Controller 객체 검색을
 * 요청한다. 그러면 HandlerMapping 객체는 프로젝트 에 존재하는 모든 Controller 객체를 검색한다.
 * HandlerMapping 객체가 Controller 객체를 검색해서 DispatcherServlet 객체에 알려주면
 * DispatcherServlet 객체는 다시 HandlerAdapter 객체에 사용자의 요청에 부합하는 메소드 검색을 요청한다. 그러면
 * HandlerAdapter 객체는 사용자의 요청 에 부합하는 메소드를 찾아서 해당 Controller 객체의 메소드를 실행한다.
 * Controller 객체의 메소드가 실행된 후 Controller 객체는 HandlerAdapter 객체에 ModelAndView 객체를
 * 반환하는데 ModelAndView 객체에는 사용자 응답에 필요한 데이터정보와 뷰정보(JSP파일)가 담겨있다. 다음으로
 * HandlerAdapter 객체는 ModelAndView 객체를 다시 DispatcherServlet 객체에 반환한다.
 * 
 * 
 * servlet-context.xml
 * 
 * 앞에서 DispatcherServlet를 서블릿으로 등록하는 과정을 살펴봤다. 서블릿으로 등록 될 때
 * contextConfigLocation이름으로 초기화 파라미 터를 servlet-context.xml로 지정하고 있는데 이때 지정된
 * servlet-context.xml파일이 스프링 설정의 역할을 하는 파일이다.
 * 
 * 스프링 설정 파일은 클래스로부터 객체(빈:bean)를 생성하고 조립하는 역할을 한다고 학습했다. servlet-context.xml에서도
 * 마찬가지로 프로젝트에 필요한 객체(빈:bean) 를 생성하고 조립한다.
 * 
 * 
 * 사용자의 요청을 실제로 처리하는 객체들 Controller Service Dao
 * 
 * Controller(컨트롤러) //사용자로 부터 /sccess요청이 발생하면 메서드를 실행
 * 
 * @RequestMapping ("/success")//사용자 요청에 대한 URL
 * 
 * public String success(Model model//success()메서드 실행후 뷰에서 활용되는 데이터를 담고 있는 객체) {
 * 
 * return "success";// 뷰로 사용되는 JSP 파일명
 * 
 * }
 * 컨트롤러 객체 - Model 타입의 파라미터
 * //	
//	@RequestMapping("/success")
//	Model = 파라미터로 모델 객체를 넣어줌
//	public String success(Model model) {
//		
//		model.setAttribute("Data","model has data!!");
//		속성 이름"Data",
//		속성 값"model has data!!"
//	
//	}
//	개발자는 모델 객체에 데이터를 담아서 DispatcherServlet에 전달할 수 있다.
//	DispatcherServlet에 전달된 Model 데이터는 View에서 가공되어 클라이언트한테
//	응답처리 된다.
//	
//	
 * 
 * 
 * 
 * View(뷰) 메서드 반환값 return "home"; JSP 파일 /WEB-INF/views/home.jsp 사용자 응답 브라우저
 * http:://localhost:9090/패키지명/클라이언트 요청정보에 해당하는 JSP 파일 실행
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */

//View 객체
//스프링 설정파일에 InternalResourceViewResolver 빈 객체를 하나 생성
//해당하는 적합한 뷰를 찾아주는 객체인데
//리턴값과 InternalResourceViewResolver의 
//suffix값은 ".jsp" 까지 합쳐서 
//retunr + .jsp 의 JSP파일을 찾아서 뷰단에 보여준다
//
//자 전체적인 웹 프로그래밍 구조를 봅시다
//
//1. 최초 사용자 요청
//http://localhost:9090/success
//	DispatcherServlet을 받겠지 어떻게 처음에 만들어준다?
//	스프링 프레임워크에 있는것으로 Web.xml에서 서블릿 등록을 하고!
//	초기 파라미터로 스프링 설정파일을 설정한다!
//	
//	컨트롤러를 찾아 누가? 핸들러 맵핑!
//	컨트롤러는 어찌 만드냐?
//	@Contoller 어노테이션이 적용된 클래스를 검색하는거야
//	적합한 컨트롤러 찾았어 그럼 다시 
//	DispatcherServlet으로 가
//	그럼 DispatcherServlet 에서는
//	적합한 메서드를 찾아야겠지 ?
//	그럼 사용자 요청 메서드가
//	success잖아
//	그러면
//	@RequestMapping("success")인 녀석을 찾아주는겨
//	메서드 찾았어 실행되겠지
//	Service Dao DB 들이 있겠지 실행이 됐겠지
//	
//	DispatcherServlet로 다시 가겠지
//	다 처리가 됐으면 Model 과 View가 오죠
//	그럼 ViewResolver에 의해서! 검색된 success.jsp < 요놈이 실행이 되겠지
//	그럼 브라우저에 View 뿌려주는거임 
//	브라우저에서 해당 JSP 응답 하는거지
//	
//




