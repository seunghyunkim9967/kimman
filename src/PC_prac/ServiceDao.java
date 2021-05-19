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
	
}
