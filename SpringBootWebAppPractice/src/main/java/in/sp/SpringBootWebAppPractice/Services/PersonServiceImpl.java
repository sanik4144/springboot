package in.sp.SpringBootWebAppPractice.Services;

import in.sp.SpringBootWebAppPractice.Entities.Person;
import in.sp.SpringBootWebAppPractice.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public boolean registerPerson(Person person) {
        try {
            personRepository.save(person);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
