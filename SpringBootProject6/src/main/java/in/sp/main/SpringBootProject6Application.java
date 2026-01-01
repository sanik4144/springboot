package in.sp.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.sp.main.beans.Student;

@SpringBootApplication
public class SpringBootProject6Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		std().display();
		std2().display();
	}
	
	@Bean
	public Student std() {
		Student std = new Student();
		
		std.setRollno(101);
		std.setName("Anik");
		std.setMarks(98.3f);
		return std;
	}
	
	@Bean
	public Student std2() {
		Student std = new Student();
		
		std.setRollno(102);
		std.setName("Sayem");
		std.setMarks(95.3f);
		return std;
	}
}
