package in.sp.SpringBootWithThymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @GetMapping("/profile")
    public String openProfilePage(Model model){
        String name = "S Anik";
        model.addAttribute("modelName", name);
        return "profile";
    }

    @GetMapping("/openConditional")
    public String openConditionalPage(Model model){
        int no1 = 100, no2= 20;
        model.addAttribute("no1", no1);
        model.addAttribute("no2", no2);
        return "conditional";
    }

    @GetMapping("/openLooping")
    public String openLoopingPage(Model model){
        List<Integer> numbers = List.of(1,2,3,4,5);
        model.addAttribute("modelNumber", numbers);
        return "looping";
    }
}
