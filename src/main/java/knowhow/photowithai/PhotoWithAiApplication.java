package knowhow.photowithai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class PhotoWithAiApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello! This is a demo application!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello from Heroku!";
    }
    public static void main(String[] args) {
        SpringApplication.run(PhotoWithAiApplication.class, args);
    }

}
