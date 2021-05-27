package PC_prac;

public class ServiceDao {

	
//	1.사용자 요청 (브라우저)
//	2.프론트 컨트롤러(DiapatcherServlet) 
//	뷰(jsp파일)
//	3.컨트롤러
//	4.서비스
//	5.Dao(Data Access Object)
//	6.Database
//	
//	한글 인코딩
//	<filter>
//	<filter-name>encodingFilter</filter-name>
//	<filter-class>
//	org.springframework.web.filter.CharacterEncodingFilter 
//	</filter-class>
//	<init-param>
//	<param-name>encoding</param-name>
//	<param-value>UTF-8</param-value>
//	</init-param>
//	<init-param>
//	<param-name>forceEncoding</param-name>
//	<param-value>true</param-value>
//	</init-param>
//	</filter>
//	<filter-mapping>
//	<filter-name>encodingFilter</filter-name>
//	<url-pattern>/*</url-pattern>
//	</filter-mapping
//	
//	
//	
//	서비스 객체 구현
//	
//	방법 1 : new 연산자를 이용한 서비스 객체 생성 및 참조
//	MemberService service = new MemberService();
//	방법 2 : 스프링 설정파일을 이용한 서비스 객체 생성 및 의존 객체 자동 주입
//	<beans:bean id="service" class="com.bs.lec17.member.service.MemberService"></beans:bean>
//	@Autowired
//	MemberService service;
//	
//	방법3: 어노테이션을 이용해서 서비스 객체 생성 및 의존 객체 자동 주입
// 	@Repository("memService")
//	public class MemberService implements IMemberService {
//	@Resource(name="memService")
//	MemberService service;
//	
//	
//	DAO 객체 구현
//	방법 : 어노테이션을 이용해서 DAO 객체 생성 및 의존 객체 자동 주입
//	@Repository
//	public class MemberDao implements IMemberDao {
//	@Autowired
//	MemberDao dao
	
	
	
	//그러니까
	//resources xml 파일에 이제 작성한 Service,Dao bean 객체를 등록 해주는거지 
	// <beans 생략 >
	
	//	<context:annotation-config />
	//	
	//	<bean id="bookDao" class="com.패키지명.BookDao"/>
	//	<bean id="bookService" class="com.패키지명.BookService"/>
	//	...
	//	...
	//	...
	//	...
		
	
	/*
	java 파일로 등록 할거야
	import
	@Configuration*/
	//public class MemberConfig {
	//<bean id="studentDao" class=ems.member.dao.StudentDao"/>
		//== //동일
		/* @Bean
		 * public StudentDao studentDao() {
		 * 
		 * return new StudentDao();
		 * 
		 * }
		 */
	/*
	 * <bean id="Service" class="패키지경로.클래스명"> <constructor-arg ref="studentDao"></>
	 * </bean>
	 * ==
	 * @Bean
	 * public StudentService registerService() {
	 *  return new StudentService(studentDaO())
	 * }
	 * 
	 * 
	 */
/*	}
	}
	
	

*/
	
	
	//===========================================================
	//정리를 좀 해보자
// 멤버 조인이라는 요청이 왔어
//	Controller에서 먼저 받아
//  멤버 아이디 패스워드 메일 폰번호 다 받은다음에
//	MemberService를 가져오고
//  멤버 서비스 가입부분을 호출해 MemberService.memberRegister
// 그러면 서비스에서 String memberId,Pw,Mail,Phone 모두 받아
//	받은정보를 DAO에 줘  DAO.memberInsert 
//  그러면 DAO 데이터베이스에 넣는건데 -> dbMap = new HashMap<String, Member>(); 맵 자료형을 이용해서 넣어줘
//  dbMap.put(memberId, member); memberId = key | member = value
//  =======================================================================
//	@RequestMapping(value="/memberJoin", method=RequestMethod.POST)
//	public String memberJoin(Model model, HttpServletRequest request){
	//자 여기서 봐봐 HttpServletRequest request << 
	//사용자가 요청한 파라미터 값이 있을거아냐
	//그러면 받아와야지
	// String memberId = request.getParameter("memberId");
	//JSP에서 memberId라는 이름으로 받아온 파라미터 값을 memberId라는 변수에 넣어주라 이말이야
	//이제 받아온 요청값
	// 회원가입할때 필요한 정보들을 받아왔잖아 그러면
	// Service.memberRegister(정보들... .. .);을 insert 해주는거지
	// 그러면 DB에 회원정보가 Insert 되는거야 ㅇㅋ? 요거 서블릿에서도 했지?
	
	//그리고 view에서 보여줄때가 있잖아 회원 정보라던지 입력값이라던지
	// 그때 model.addAttribute("memberId",memberId); 
	// jsp에서 ID : ${memberId}
	// 이런식으로 model에 memberId라는 값을 들고 view 페이지로 가기 때문에 jsp에서는 ${memberId}를 입력해주면 모델에 있는 정보 조회를 할수있는거지
//}
//	자 컨트롤러에서 저런식으로 해도 문제없이 받아와 지지만 우린 스프링을 하고있잖아
//	jsp에서 사용자가 요청한 파라미터값을 서블릿리퀘스트로 받아도 되지만
//	Member Vo에 이미 Setter Getter가 있어
//	그러면 사용자가 정보를 날리면 이 세터 메서드가 실행이 되면서 
//	Member vo 프로퍼티에 다 들어가게 되는거야
//	그럼 String memberId = request.getParameter("memberId");
//	이렇게 받아오던걸 어떻게 받아올거냐 
//	멤버에 setter에 정보가 들어가게 된다 했잖아 Setter는 넣어주는거고 Getter는 가져오는거라고 생각하고 있어 나는
//	그래서 member.getMemberId() 이런 방식으로 비밀번호 메일 번호 다 받아오는거지 ㅇㅋ?
//	public String memberJoin(Member member) {
//		
//		memberService.memberRegister(member.getmemberId(),member.getmemberName() ..member..member.) 쭉쭉쭉
//		
//		자 그러면 여기서 또 의문점이 model에 담아서 view로 넘겨줘야 하는데 model이 없어 이거 어케넘겨줘?
//	    기존에 model.addAttribute("memberId",memberId); 이렇게 넘겨주던걸
//	    member에 담겨있는것을 그냥 jsp페이지에서 ${member.memberId} 이렇게 하면 정보 조회가 가능해
//	}
// Service
	
	
//DAO
	
}