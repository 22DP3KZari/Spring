package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

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

    @GetMapping(value = "/experiment")
    String experiment(){
        return "experiment";
    }

    @GetMapping(value = "/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("test");
        //modelAndView.addObject("name", "Jānis");
        //modelAndView.addObject("surname", "Bērziņš");
        //modelAndView.addObject("age", 20);
        //modelAndView.addObject("date", new Date());

        Money macins1 = new Money(10, 0);
        modelAndView.addObject("", macins1);
        return modelAndView;

        // Constructor overloading
        // Money macins1 = new Money(euros:10, cents: 0);
        // Money macins2 = new Money(euros:10);
        // Money macins3 = new Money();

        // Method overloading
        // macins1.plus(Money money);
        // this.euros + euros, return new Money(...);
        // macins1.plus(int euros);
        // this.cents + cents, return new Money(...);
        // macins1.plus(byte cents);
    }
}
