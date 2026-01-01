package in.sp.SpringBootWebAppProject.Services;

import in.sp.SpringBootWebAppProject.Entites.Employee;
import in.sp.SpringBootWebAppProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean registerEmployee(Employee employee) {
        try {
            studentRepository.save(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
