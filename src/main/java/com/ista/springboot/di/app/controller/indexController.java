package com.ista.springboot.di.app.controller;

import com.ista.springboot.di.app.model.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    private MiServicio servicio = new MiServicio();

    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}
