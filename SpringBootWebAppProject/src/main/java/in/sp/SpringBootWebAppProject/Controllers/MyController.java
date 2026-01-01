package in.sp.SpringBootWebAppProject.Controllers;

import in.sp.SpringBootWebAppProject.Entites.Employee;
import in.sp.SpringBootWebAppProject.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/registerUserPage")
    public String registerUser(Model model){
        model.addAttribute("emp", new Employee());
        return "register";
    }

    @PostMapping("/postUserPage")
    public String postUser(@ModelAttribute("emp") Employee emp, Model model){
        boolean status = employeeService.registerEmployee(emp);
        if(status) model.addAttribute("successMsg", "Registration Successful");
        else model.addAttribute("failedMsg", "Registration Failed");

        return "register";
    }
}
