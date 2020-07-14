package com.lombi.leandro.microservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedido")

public class pedidoController {

    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String getPedido(){
        return "Lombi";
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String postPedido(){
        return "Pedido gravado!";
    }

    //springdata
    //springjpa
    //lombok - diminuidor de
}
