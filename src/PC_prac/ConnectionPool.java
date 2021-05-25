package PC_prac;

public class ConnectionPool {

//	스프링 설정파일을 이용한 DataSource 설정
//	<beans:bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
//	<beans:property name="driverClass" value="oracle.jdbc.driver.OracleDriver" />
//	<beans:property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:xe" />
//	<beans:property name="user" value="scott" />
//	<beans:property name="password" value="tiger" />
//	<beans:property name="maxPoolSize" value="200" />
//	<beans:property name="checkoutTimeout" value="60000" />
//	<beans:property name="maxIdleTime" value="1800" />
//	<beans:property name="idleConnectionTestPeriod" value="600" />
//	</beans:bean>
//	
//	
//	Config 클래스 생성
//	@Configuration 어노테이션
//	
//	@Bean 어노테이션
//	public ComboPooledDataSource dataSource() throws PropertyVetoException{
//		
//		ComboPooledDataSource dataSource = new DriverManagerDataSoruce();
//		
//		dataSource.setDriverClass(driver);
//		dataSource.setJdbcUrl(url);
//		dataSource.setUser(userid);
//		dataSource.setPassword(userpw);
//		dataSource.setMaxPoolSize(200);
//		dataSource.setCheckoutTimeout(68000);
//		dataSource.setMaxIdleTime(1800);
//		dataSource.setIdleConnectionTestPeriod(600);
//		
//		return dataSource;
//
//	}
}
