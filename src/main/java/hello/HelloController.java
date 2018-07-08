package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/home")
    public String home() {
        return "Welcome to Spring boot world in azure!";
    }
}
