package knowhow.photowithai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@SpringBootApplication
public class PhotoWithAiApplication {

    @GetMapping("/")
    @ResponseBody
    String home() {
        return "Hello! This is a demo application!";
    }

    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello from Heroku!";
    }

    @PostMapping("/upload")
    @ResponseBody
    String uploadMulti(@RequestParam("files") List<MultipartFile> files) throws Exception {
        return "uploaded";
    }

    public static void main(String[] args) {
        SpringApplication.run(PhotoWithAiApplication.class, args);
    }

}
