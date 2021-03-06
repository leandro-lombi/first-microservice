package com.lombi.leandro.microservice.service;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericService<T, I> {

    Page<T> getAllPaginated(Pageable pageable);

    T get(I id);

    T addOrUpdate(T entity);

    void removeById(I id);
}
