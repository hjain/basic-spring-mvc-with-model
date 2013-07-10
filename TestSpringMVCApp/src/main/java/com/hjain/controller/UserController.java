package com.hjain.controller;

import com.hjain.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping("/welcome")
public class UserController {

    /*
    Objective: Illustrate usage of Request and simple MVC call
     */

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Welcome to Spring 3 MVC Hello App");
        return "hello";
    }

    /*
    Objective: Illustrate usage of Model
     */

    @RequestMapping(method = RequestMethod.GET, value="/user")
    public ModelAndView getUserInfo() {

        User user = new User();

        // Set User
        user.setFirstName("Hina");
        user.setLastName("Jain");
        user.setGreeting("Welcome to Spring Model Example");

        // return ModelAndView
        return new ModelAndView("userInfo", "user", user);
    }
}
