package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringBootProject7JdbcCrudApplication implements CommandLineRunner{
	
	@Autowired
	private UserDao userdao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject7JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User("Sayem", "s@mail.c", "Male", "Gazipur");
//		
//		user1.setName("Murad");
//		user1.setEmail("m@mail.c");
//		user1.setGender("Male");
//		user1.setCity("Dhaka");
//		
//		boolean status = userdao.insertUser(user1);
//		
//		if(status) System.out.println("Insertion Success");
//		else System.out.println("Insertion Failed");
		
//		boolean value = userdao.updateUser(user1);
//		
//		if(value) System.out.println("Updation Success");
//		else System.out.println("Updation Failed");
		
//		boolean value = userdao.deleteUser("s@mail.c");
//		
//		if(value) System.out.println("Deletion Success");
//		else System.out.println("Deletion Failed");
		
//		User user = userdao.getUserByEmail("a@mail.c");
//		System.out.println("Name: "+user.getName());
//		System.out.println("Email: "+user.getEmail());
//		System.out.println("Gender: "+user.getGender());
//		System.out.println("City: "+user.getCity());
		
		List<User> users = userdao.getAllUsers();
		
		for(User user: users) {
			System.out.println("Name: "+user.getName());
			System.out.println("Email: "+user.getEmail());
			System.out.println("Gender: "+user.getGender());
			System.out.println("City: "+user.getCity());
		}
	}

}
