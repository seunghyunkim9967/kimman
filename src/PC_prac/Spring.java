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
	
	
}
