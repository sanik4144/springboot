package in.sp.main.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				std1().display();
				std2().display();
			}
		};
	}
	
	@Bean
	public Student std1() {
		return new Student(105, "Saifullah", 45.6f);
	}
	@Bean
	public Student std2() {
		return new Student(106, "Saif", 46.6f);
	}
	
}
