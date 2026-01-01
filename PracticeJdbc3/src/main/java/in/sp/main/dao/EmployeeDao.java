package in.sp.main.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.users.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String insert(Employee emp) {
		String insert_q = "INSERT INTO employee VALUES(?,?,?)";
		
		int value = jdbcTemplate.update(insert_q, emp.getEmpId(), emp.getName(), emp.getSalary());
		
		if(value>0) return "Insertion Success";
		return "Insertion Failed";
	}
	
	public void display() {
		String display_q = "SELECT * FROM employee";
		
		List<Employee> list_emp = jdbcTemplate.query(display_q, (rs, rowNum) ->
        							new Employee(rs.getInt("empId"), rs.getString("name"), rs.getInt("salary"))
        );
		
		for(Employee emp: list_emp) {
			System.out.println("ID: "+emp.getEmpId());
			System.out.println("Name: "+emp.getName());
			System.out.println("Salary: "+emp.getSalary());
		}
	}
}
