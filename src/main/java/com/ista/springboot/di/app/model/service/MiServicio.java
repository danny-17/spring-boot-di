package com.ista.springboot.di.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MiServicio  implements IServicio{

    @Override
    public String operacion(){
        return "Ejecuta un procesito ";
    }

}
