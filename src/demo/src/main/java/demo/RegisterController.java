package demo;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
     @RequestMapping("/")
     public ModelAndView showLogin() {
    	 return new ModelAndView("register");
     }
     @RequestMapping("/welcome")
     public ModelAndView doRegister(HttpServletRequest req) {
    	 String name = req. getParameter("stname");
		return new ModelAndView("welcome","m", name);
    	 
     }
     
     
}
