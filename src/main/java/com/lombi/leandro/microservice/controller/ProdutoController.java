package com.lombi.leandro.microservice.controller;

import com.lombi.leandro.microservice.dto.ProdutoDTO;
import com.lombi.leandro.microservice.entity.Produto;
import com.lombi.leandro.microservice.mapper.ProdutoMapper;
import com.lombi.leandro.microservice.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@Api(value = "Produto Controller")
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/")
    public Page<Produto> getAllProdutoPage(final Pageable pageable){
        return produtoService.getAllPaginated(pageable);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Encontrando o produto pelo id")
    public ProdutoDTO findById(@ApiParam(value = "id", required = true) @PathVariable Long id){
        return ProdutoMapper.convertToDTO(produtoService.get(id));
    }

}
