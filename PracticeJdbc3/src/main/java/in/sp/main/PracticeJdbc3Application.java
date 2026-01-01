package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.EmployeeDao;
import in.sp.main.users.Employee;

@SpringBootApplication
public class PracticeJdbc3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PracticeJdbc3Application.class, args);
	}
	
	@Autowired
	EmployeeDao empdao;

	@Override
	public void run(String... args) throws Exception {
//		Employee emp = new Employee(103, "Murad", 20214);
		
//		System.out.println(empdao.insert(emp));
		
		empdao.display();
	}

}
