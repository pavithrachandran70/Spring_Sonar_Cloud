package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String home(Model model) {
        logger.info("HomeController: Handling home page request");
        model.addAttribute("message", "Welcome to Spring MVC with SLF4J Logging!");
        return "home"; // corresponds to /WEB-INF/views/home.jsp
    }
}
