package org.idrice24.controllers;

import org.idrice24.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    private UserServices userServices;
    
        @Autowired
        public void setUserSer(UserServices userServices){
            this.userServices = userServices;
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("model", model);
        return "login";
    }

}
