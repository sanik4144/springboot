package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.Users.Student;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String insertStudent(Student student) {
		int status = 0;
		
		try {
			String insert_query = "INSERT INTO students VALUES(?, ?, ?, ?)";
			status = jdbcTemplate.update(insert_query, student.getStdId(), student.getName(), student.getEmail(), student.getMarks());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) return "Insertion Successful";
		return "Insertion Failed";
	}
	
	public String updateStudent(Student student) {
		String update_query = "UPDATE students SET id_row=?, name_row=?, marks_row=? WHERE email_row=?";
		int value = jdbcTemplate.update(update_query, student.getStdId(), student.getName(), student.getMarks(), student.getEmail());
		
		if(value>0) return "Updation Succesful";
		return "Updation Failed";
	}
	
	public String deleteStudent(String email) {
		String delete_query = "DELETE FROM students WHERE email_row=?";
		int value = jdbcTemplate.update(delete_query, email);
		
		if(value>0) return "Deletion Successful";
		return "Deletion Failed"; 
	}
}
