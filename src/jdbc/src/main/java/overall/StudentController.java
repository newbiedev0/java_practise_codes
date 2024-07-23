package overall;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class StudentController {

     @RequestMapping("/")
     public ModelAndView showData() {
    	 return new ModelAndView("register");
     }
     
}
