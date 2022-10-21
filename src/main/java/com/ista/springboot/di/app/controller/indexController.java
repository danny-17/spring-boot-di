package com.ista.springboot.di.app.controller;

import com.ista.springboot.di.app.model.service.IServicio;
import com.ista.springboot.di.app.model.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    // private MiServicio servicio = new MiServicio();
    @Autowired
    @Qualifier("miServicioComplejo")
    private IServicio servicio;

    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}
