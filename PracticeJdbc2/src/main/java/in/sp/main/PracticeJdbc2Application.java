package in.sp.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.Users.Student;
import in.sp.main.dao.UserDao;

@SpringBootApplication
public class PracticeJdbc2Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeJdbc2Application.class, args);
	}
	
	@Autowired
	UserDao userDao;
	
	Scanner inp = new Scanner(System.in);
	
	public void insert() {
		System.out.println("Enter Student Details");
		System.out.println("---------------------");
		System.out.print("Student ID: ");
		int id = Integer.parseInt(inp.nextLine());
		System.out.print("Student Name: ");
		String name = inp.nextLine();
		System.out.print("Student Email: ");
		String email = inp.nextLine();
		System.out.print("Student Marks: ");
		float marks = inp.nextFloat();
		
		Student std = new Student(id, name, email, marks);
		
		System.out.println(userDao.insertStudent(std)); 
	}
	
	public void update() {
		System.out.print("Enter Student Email to Update: ");
		String email = inp.nextLine();
		System.out.println("-------------------------------");
		
		System.out.print("Updated Student ID: ");
		int id = Integer.parseInt(inp.nextLine());
		System.out.print("Updated Student Name: ");
		String name = inp.nextLine();
		System.out.print("Updated Student Marks: ");
		float marks = inp.nextFloat();
		
		Student std = new Student(id, name, email, marks);
		System.out.println(userDao.updateStudent(std));
	}
	
	public void delete() {
		System.out.print("Enter Student Mail to Delete: ");
		String email = inp.nextLine();
		
		System.out.println(userDao.deleteStudent(email));
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("1 ---> Insert");
		System.out.println("2 ---> Update");
		System.out.println("3 ---> Delete");
		System.out.print("Enter a number (1-3): ");
        int choice = Integer.parseInt(inp.nextLine());

        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                update();
                break;
            case 3:
                delete();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

	}

}
