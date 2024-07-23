package jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stud = new Student();
		stud.setId(rs.getInt("id"));
		stud.setName(rs.getString("name"));
		stud.setAge(rs.getInt("age"));
		System.out.println("hello" + stud);
		return stud;
	}

}
