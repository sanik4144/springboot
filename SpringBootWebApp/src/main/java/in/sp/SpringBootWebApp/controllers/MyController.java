package in.sp.SpringBootWebApp.controllers;

import in.sp.SpringBootWebApp.Entities.User;
import in.sp.SpringBootWebApp.Services.UserService;
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
    public String openRegPage(Model model){
        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/regForm")
    public String submitRegForm(@ModelAttribute("user") User user, Model model){
        boolean status = userService.registerUser(user);
        if(status){
            model.addAttribute("successMsg", "Registration Successful");
        }
        else{
            model.addAttribute("errorMsg", "Registration Failed");
        }
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
        if(validUser != null){
            return "profile";
        }
        else{
            model.addAttribute("errorMsg", "Email Password doesnt match");
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logoutUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session!=null) session.invalidate();
        return "login";
    }
}
