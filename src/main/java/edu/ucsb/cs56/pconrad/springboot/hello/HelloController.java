package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/ingredients")
    public String ingridients() {
        return "ingredients";
    }

	@RequestMapping("/recipes")
	public String recipes() {
        return "recipes";
    }

	@RequestMapping("/page3")
	public String page3() {
        return "page3";
    }

	
}
