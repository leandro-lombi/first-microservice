package com.lombi.leandro.microservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "sku")
    private String sku;

    @Column(name = "peso")
    private long peso;

    @Column(name = "altura")
    private long altura;

    @Column(name = "profundidade")
    private long profundidade;

    @Column(name = "fabricante")
    private String fabricante;

    @Column(name = "preco")
    private long preco;

}
