package in.sp.SpringBootWebAppPractice.Controllers;

import in.sp.SpringBootWebAppPractice.Entities.Person;
import in.sp.SpringBootWebAppPractice.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    private PersonService personService;

   @GetMapping("/registerPage")
   public String getRegister(Model model){
       model.addAttribute("person", new Person());

       return "register";
   }

   @PostMapping("/registerPerson")
    public String postRegister(@ModelAttribute("person") Person person, Model model){
       boolean status = personService.registerPerson(person);

       if(status) model.addAttribute("successMsg", "Registration Successful");
       else model.addAttribute("errorMsg", "Registration Failed");

       return "register";
   }
}
