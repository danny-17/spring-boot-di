package com.ista.springboot.di.app.model.service.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
@Component
public class Factura {
    @Value("${factura.descripcion}")
    private  String descripcion;

//    @PostConstruct
//    public void inicializar(){
//        cliente.setNombre(cliente.getNombre().concat(" ").concat("Danny"));
//        descripcion=descripcion.concat(" del cliente ").concat(cliente.getNombre().concat(" ").concat(cliente.getApellido().concat(" ").concat("Tenemea")));
//    }

    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida");
    }

    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> items;

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}