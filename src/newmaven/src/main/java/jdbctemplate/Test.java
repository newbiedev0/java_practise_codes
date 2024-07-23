package jdbctemplate;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Student student=new Student("logesh",24);
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentData studentData = (StudentData) ac.getBean("StudentData");
		// studentData.saveStudent(student);

		List<Student> studList = studentData.listStudent();

		studList.forEach((student) -> System.out.println(student));

	}

}