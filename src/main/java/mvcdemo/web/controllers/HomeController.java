package mvcdemo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method =  RequestMethod.GET)
    public String index(Locale locale, Model model) {
        System.out.printf("here I am");
        return "home";
    }
}
