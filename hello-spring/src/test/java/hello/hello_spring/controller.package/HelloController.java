package hello.hellospring.controller;

import org.springframework.stereotypt.Controller;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!");
	return "hello";
	}
}
