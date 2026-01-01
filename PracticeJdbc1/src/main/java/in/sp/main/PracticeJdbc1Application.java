package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.Dao.EmpDao;
import in.sp.main.Users.Employee;

@SpringBootApplication
public class PracticeJdbc1Application implements CommandLineRunner{
	
	@Autowired
	private EmpDao empdao;
	public static void main(String[] args) {
		SpringApplication.run(PracticeJdbc1Application.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee(101, "Anik", 10250);
		boolean value = empdao.insertEmp(emp);
		
		if(value) emp.display();
		else System.out.println("Insertion Failed");
	}

}
