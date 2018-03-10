package com.julien.climbers.controllers;

import com.julien.climbers.entities.Usor;
import com.julien.climbers.service.UsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignController {

    @Autowired
    private UsorService usorService;

    @GetMapping("/sign")
    public String sign(){

        return "sign";
    }

    @RequestMapping(value = "/sign", method = RequestMethod.POST, params = "signin")
    public String signin(@RequestParam String emailIn, @RequestParam String passwordIn){
        System.out.println(emailIn + passwordIn);
        return "sign";
    }

    @RequestMapping(value = "/sign", method = RequestMethod.POST, params = "signup")
    public String signup(@RequestParam String pseudo, @RequestParam String emailUp, @RequestParam String passwordUp1,@RequestParam String passwordUp2, Model model){
        Usor usor = new Usor(null,pseudo, emailUp, passwordUp1);
        String message = "";

        if (usorService.getUsorByEmail(emailUp)!= null)
            message = "Cet email est déjà utilisé, mot de passe oublié?";
        else {
            if (checkUserValidity(false, pseudo, emailUp, passwordUp1, passwordUp2)) {
                usorService.addUsor(usor);
                message = "Nouvel utilisateur sauvegardé";
            }else
                message = "Veuillez recommencer. La saisie n'est pas valide.";
        }




            model.addAttribute("message", message);

        return "sign";
    }

    private boolean checkUserValidity(Boolean signin, String pseudo, String email, String pw1, String pw2){

            return false;
    }
}
