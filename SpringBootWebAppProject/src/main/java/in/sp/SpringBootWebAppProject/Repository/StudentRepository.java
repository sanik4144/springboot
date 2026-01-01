package in.sp.SpringBootWebAppProject.Repository;

import in.sp.SpringBootWebAppProject.Entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Employee, Long> {
}
