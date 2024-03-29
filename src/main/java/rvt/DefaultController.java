package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class DefaultController {
    
    @GetMapping(value = "/")
    String index (@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    
    @GetMapping(value = "/hello")
    String hello(){
        return "hello";
    }

    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }

    @GetMapping(value = "/links")
    String links(){
        return "links";
    }
}