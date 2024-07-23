package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("javaconfig")
public class JavaConfigSpring {
	@Bean
	@Scope("prototype")
	public Mobile getMobile() {
		Mobile m = new Mobile();
	    m.setBrand("samsung");
		return m;
		
	}
	
}
