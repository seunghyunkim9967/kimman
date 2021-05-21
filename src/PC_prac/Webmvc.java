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