package knowhow.photowithai.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.util.List;

@Controller
public class ImageApiController {
    @GetMapping("hello")
    public String hello(@NotNull Model model) {
        model.addAttribute("data", "hello!!"); //key:data, value:hello!!
        return "hello";
    }

    @PostMapping("/upload/photos")
    public String uploadMulti(@RequestParam("files") List<MultipartFile> files) throws Exception {

        System.out.println("uploaded");
        return "redirect:/";
    }

}


