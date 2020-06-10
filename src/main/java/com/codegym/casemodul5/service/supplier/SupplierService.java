package com.codegym.casemodul5.service.supplier;

import com.codegym.casemodul5.model.Supplier;

public interface SupplierService {
    Iterable<Supplier> getList();

    Supplier save(Supplier supplier);

    void delete(Long id);

    Supplier findById(Long id);
}
