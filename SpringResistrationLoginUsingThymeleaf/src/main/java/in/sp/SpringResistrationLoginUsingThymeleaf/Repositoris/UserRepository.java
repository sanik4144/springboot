package in.sp.SpringResistrationLoginUsingThymeleaf.Repositoris;

import in.sp.SpringResistrationLoginUsingThymeleaf.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
