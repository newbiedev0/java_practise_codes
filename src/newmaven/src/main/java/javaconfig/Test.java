package javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigSpring.class);
		Mobile m = (Mobile)context.getBean("getMobile");
		m.getBrand();
		
	}

}
