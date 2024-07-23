package jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentData {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveStudent(Student student) {

		String query = "insert into Student(name,age) values('" + student.getName() + "'," + student.getAge() + ")";
		jdbcTemplate.update(query);
	}

	public List<Student> listStudent() {
		List<Student> studentList = jdbcTemplate.query("Select * from Student", new StudentRowMapper());
		System.out.println(studentList.getClass());
		return studentList;
	}

}
