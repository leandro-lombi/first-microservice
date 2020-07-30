package com.lombi.leandro.microservice.mapper;

import com.lombi.leandro.microservice.dto.ProdutoDTO;
import com.lombi.leandro.microservice.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMapper {

    public static List<Produto> convertToListEntity(final List<ProdutoDTO> produtoDTOS){

        final List<Produto> produto = new ArrayList<>();

        produtoDTOS.forEach(produtoDTO -> {
            produto.add(convertToEntity(produtoDTO));
        });

        return produto;
    }

    public static Produto convertToEntity(final ProdutoDTO produtoDTO){
        final Produto produto = new Produto();

        produto.setId(produtoDTO.getId());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setSku(produtoDTO.getSku());
        produto.setPeso(produtoDTO.getPeso());
        produto.setAltura(produtoDTO.getAltura());
        produto.setProfundidade(produtoDTO.getProfundidade());
        produto.setLargura(produtoDTO.getLargura());
        produto.setFabricante(produtoDTO.getFabricante());
        produto.setPreco(produtoDTO.getPreco());

        return produto;
    }

    public static ProdutoDTO convertToDTO(final Produto produto){

        final ProdutoDTO dto = new ProdutoDTO();

        dto.setId(produto.getId());

        dto.setDescricao(produto.getDescricao());
        dto.setSku(produto.getSku());
        dto.setPeso(produto.getPeso());
        dto.setAltura(produto.getAltura());
        dto.setProfundidade(produto.getProfundidade());
        dto.setLargura(produto.getLargura());
        dto.setFabricante(produto.getFabricante());
        dto.setPreco(produto.getPreco());

        return dto;
    }
}
