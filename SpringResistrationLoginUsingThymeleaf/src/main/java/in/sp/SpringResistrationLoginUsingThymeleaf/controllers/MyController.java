package in.sp.SpringResistrationLoginUsingThymeleaf.controllers;

import in.sp.SpringResistrationLoginUsingThymeleaf.Entities.User;
import in.sp.SpringResistrationLoginUsingThymeleaf.Services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/regPage")
    public String openRegistrationPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/regForm")
    public String submitRegistrationForm(@ModelAttribute("user") User user, Model model){
        boolean status = userService.registerUser(user);
        if(status) model.addAttribute("successMsg", "User Registration Successful");
        else model.addAttribute("errorMsg", "Registration Failed");

        return "register";
    }

    @GetMapping("/loginPage")
    public String openLoginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/loginForm")
    public String submitLoginForm(@ModelAttribute("user") User user, Model model){
        User validUser = userService.loginUser(user.getEmail(), user.getPassword());

        if(validUser!=null){
            model.addAttribute("userName", validUser.getName());
            return "profile";
        }
        else{
            model.addAttribute("errorMsg", "Email Pass dont match");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);

        if(session!=null){
            session.invalidate();
        }

        return "redirect:/loginPage";
    }
}
