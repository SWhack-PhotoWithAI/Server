//package knowhow.photowithai.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.swing.filechooser.FileSystemView;
//import java.io.File;
//import java.util.List;
//
//@Controller
//public class ImageApiController {
//
//    @PostMapping("/upload/photos")
//    public String uploadMulti(@RequestParam("files") List<MultipartFile> files) throws Exception {
//        for(int i = 0; i < files.size(); i++){
//            System.out.println(files.stream().findAny());
//        }
//        System.out.println("uploaded");
//        return "redirect:/";
//    }
//
//}
//
//
