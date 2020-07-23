package com.lombi.leandro.microservice.service;

import com.lombi.leandro.microservice.entity.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ProdutoService extends GenericService<Produto, Long>{
    //Page<Produto> getAllPaginatedProduto(Pageable pageable, String descricao, String sku);
}
