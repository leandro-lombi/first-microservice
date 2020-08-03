package com.lombi.leandro.microservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private long id;
    private String descricao;
    private String sku;
    private long peso;
    private long altura;
    private long profundidade;
    private long largura;
    private String fabricante;
    private long preco;
}
