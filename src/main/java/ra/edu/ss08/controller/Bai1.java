package ra.edu.ss08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bai1")
public class Bai1 {
    @GetMapping
    public String bai1(Model model) {
        return "bai1";
    }
}
