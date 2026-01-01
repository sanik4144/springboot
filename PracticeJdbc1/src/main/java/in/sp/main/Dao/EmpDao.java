package in.sp.main.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.Users.Employee;

@Repository
public class EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertEmp(Employee emp) {
		boolean status = false;
		
		try {
			String query = "INSERT INTO employee VALUES(?,?,?)";
			
			int value = jdbcTemplate.update(query, emp.getEmpId(), emp.getName(), emp.getSalary());
			if(value>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
}
