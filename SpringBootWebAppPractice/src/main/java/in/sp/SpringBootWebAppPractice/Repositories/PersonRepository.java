package in.sp.SpringBootWebAppPractice.Repositories;

import in.sp.SpringBootWebAppPractice.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
