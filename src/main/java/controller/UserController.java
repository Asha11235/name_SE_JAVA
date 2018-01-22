package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Products;
import entity.Users;
import repository.UserRepository;
import service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping(value = "/createuser", method = RequestMethod.GET)
	 public String createUser(Model model) {
		 Users user = new Users();
		 model.addAttribute("user", user);
		 return "/createuser";
	 }
	 
	 @RequestMapping(value = "/processUserForm", method=RequestMethod.POST)
	 public String processForm(@ModelAttribute(value="user") Users user) {
		 
		 System.out.println(user.toString());
		 userService.save(user);
		 return "welcome";
	 }
	 

}
