package com.ista.springboot.di.app;

import com.ista.springboot.di.app.model.service.IServicio;
import com.ista.springboot.di.app.model.service.MiServicio;
import com.ista.springboot.di.app.model.service.MiServicioComplejo;
import com.ista.springboot.di.app.model.service.models.domain.ItemFactura;
import com.ista.springboot.di.app.model.service.models.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Appconfig {

    @Bean("MiServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("MiServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }


    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Llanta", 100.0);
        Producto producto2 = new Producto("Aro", 200.0);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2,4);

        return Arrays.asList(linea1,linea2);
    }
}
