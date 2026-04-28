package lakshita.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping({"/", "", "/home"})
    public String showHomePage(){
        return "home"; 
    }
    @GetMapping("/resume")
        public String resume() {
        return "resume";
    }

    @GetMapping("/projects")
        public String projects() {
        return "projects";
    }

    @GetMapping("/contact")
        public String contact() {
        return "contact";
    }

    @GetMapping("/privacy")
public String privacy() {
    return "privacy";
}

@GetMapping("/terms")
public String terms() {
    return "terms";
}
@PostMapping("/contact")
public String handleContact(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String phone,
        @RequestParam String message,
        Model model
) {

    // Print data in console (for now)
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Phone: " + phone);
    System.out.println("Message: " + message);

    // Send success flag to frontend
    model.addAttribute("success", true);

    return "contact";
}
}
