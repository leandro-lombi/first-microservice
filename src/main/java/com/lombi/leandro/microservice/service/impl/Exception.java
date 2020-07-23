package com.lombi.leandro.microservice.service.impl;

import javassist.NotFoundException;

import java.util.Optional;

public class Exception {

    public void NotFoundException(final Optional<?> optional) throws NotFoundException {
        if(!optional.isPresent()){
            throw new NotFoundException("Erro não encontrado");
        }
    }
}
