package com.lombi.leandro.microservice.service.impl;

import com.lombi.leandro.microservice.entity.Produto;
import com.lombi.leandro.microservice.repository.ProdutoRepository;
import com.lombi.leandro.microservice.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private ProdutoRepository produtoRepo;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    @Override
    public Page<Produto> getAllPaginated(final Pageable pageable) {
        return produtoRepo.findAll(pageable);
    }

    @Override
    public Produto get(Long id) {
        final Optional<Produto> produto = produtoRepo.findById(id);

        return produto.get();
    }

    @Override
    public Produto addOrUpdate(final Produto entity) {
        return this.produtoRepo.save(entity);
    }

    @Override
    public void removeById(Long id) {
        produtoRepo.deleteById(id);
    }

}
