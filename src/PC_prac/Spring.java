package PC_prac;

public class Spring {
	/*
	 * 의존 객체 자동 주입이란. 스프링 설정 파일에서 의존 객체를 주입할 때 <constructor-org> 또는 <property> 태그로
	 * 의존 대상 객체를 명시하지 않아도 스프링 컨테이너가 자동으로 필요한 의존 대상 객체를 찾아서 의존 대상객체가 필요한 객체에 주입해 주는
	 * 기능이다. 구현 방법은 @Autowired와 @Resource 어노테이션을 이용해서 쉽게 구현할 수 있다.
	 */
	
	
	/*
	 * @Autowired
	 * 
	 * @Resource 주입하려고 하는 객체의 타입이 일치하는 객체를 자동으로 주입한다.
	 * 
	 * 동일한 객체가 2개 이상인 경우 스프링 컨테이너는 자동 주입 대상 객체를 판단하지 못해서 Exception을 발생시킨다.
	 * 
	 * 
	 * //의존객체 선택
	 * 
	 * <bean id="wordDao" class="com.word.dao.WordDao" > <qualifier
	 * value="usedDao"/> </bean> <bean id="wordDao2" class="com.word.dao.WordDao" />
	 * <bean id="wordDao3" class="com.word.dao.WordDao" />
	 * 
	 * ->@Autowired
	 * 
	 * @Qualifier("usedDao") private WordDao wordDao;
	 * 
	 * @Inject
	 * 
	 * @Autowired와 거의 비슷하게 @Inject 어노테이션을 이용해서 의존 객체를 자동으로 주입을 할 수 있다.
	 * 
	 * @Autowired와 차이점 이라면 @Autowired의 경우 required 속성을 이용해서 의존 대상 객체가 없어도 익셉션을 피할 수
	 * 있지만,
	 * 
	 * @Inject의 경우 required 속성을 지원하지 않는다.
	 */
	
	/*
	 * 브라우저 -> 컨트롤러 -> 서비스 -> DAO -> model <-> model -> 데이터베이스
	 * 
	 * 
	 * Model1 방식은 모든코드를 하나에 때려박아서 빠른 구현가능 But 유지보수가 힘듬
	 * 
	 * Model2 MVC 패턴으로 각자 역할을 나누어 쉬운 유지보수 가능
	 */
	
	/*
	 * DispatcherServlet -> 요청 ex)날씨 요청 -> (1)HandlerMapping = 수 많은 컨트롤러 중에 가장 적합한
	 * 녀석을 찾아줘 -> 다시 HandlerMapping 이 DispatcherServlet 으로 와서 -> (2)
	 * DispatcherServlet -> HandlerAdater 한테 또 요청 컨트롤러 객체가 있으면 많은 메서드가 있을 수 있지 이런
	 * 메서드 중에 사용자가 요청한걸 처리할 수 있는 가장 적합한 메서드 찾은다음 Model 이라는 데이터로 가져와요! 컨트롤러를 거쳐서 다시
	 * 돌아오면 DispatcherServlet은 View Resolver를 또 찾아유 요 컨트롤러 뒤에는 Service,Dao,DB가 있겠쥬
	 * 이것들을 다 묶어서 Controller라고 생각하고 적는중이다 View Resolver는 이 컨트롤러 부터 모델과 데이터가 왔는디 이
	 * View에 해당하는 가장 적합한 JSP를 찾아주세요! 그럼 가장 적합한 JSP를 클라이언트한테 응답해준다! 이야!
	 */
	 


	
	
}
