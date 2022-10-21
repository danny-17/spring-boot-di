package com.ista.springboot.di.app.model.service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio  implements IServicio{

    @Override
    public String operacion(){
        return "Ejecuta un procesito ";
    }

}
