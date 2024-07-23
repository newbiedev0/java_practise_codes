package venkat.newmaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("context.xml");
        Car c = (Car) Context.getBean("car");
        c.move();
	}

}
