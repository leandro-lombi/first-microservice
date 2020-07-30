package com.lombi.leandro.microservice.controller;

import com.lombi.leandro.microservice.dto.ProdutoDTO;
import com.lombi.leandro.microservice.entity.Produto;
import com.lombi.leandro.microservice.exception.ApiRequestException;
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
    @ApiOperation(value = "Encontrando todos os produtos paginado")
    public Page<Produto> getAllProdutoPage(final Pageable pageable) {
//         throw new ApiRequestException("Testando");
        return produtoService.getAllPaginated(pageable);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Encontra o produto pelo id")
    public ProdutoDTO findById(@ApiParam(value = "id", required = true) @PathVariable Long id) {
        try {
            return ProdutoMapper.convertToDTO(produtoService.get(id));
        } catch (Exception e) {
            throw new ApiRequestException("Registro não encotrado");
        }
    }

    @PostMapping()
    @ApiOperation("Adiciona produto")
    public ProdutoDTO create(@ApiParam(value = "Produto", required = true)
                             @RequestBody final ProdutoDTO dto) {
        final Produto produto = ProdutoMapper.convertToEntity(dto);
        return ProdutoMapper.convertToDTO(produtoService.addOrUpdate(produto));
    }

    @PutMapping("/{id}")
    @ApiOperation("Atualiza produto")
    public ProdutoDTO update(@ApiParam(value = "Produto", required = true)
                             @RequestBody final ProdutoDTO dto) {
        final Produto produto = ProdutoMapper.convertToEntity(dto);
        return ProdutoMapper.convertToDTO(produtoService.addOrUpdate(produto));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deleta produto")
    public void delete(@ApiParam(value = "id", required = true) @PathVariable final Long id) {
        produtoService.removeById(id);
    }


}
