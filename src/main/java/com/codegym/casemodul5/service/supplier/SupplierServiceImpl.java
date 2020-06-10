package com.codegym.casemodul5.service.supplier;

import com.codegym.casemodul5.model.Supplier;
import com.codegym.casemodul5.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierRepository supplierRepository;
    @Override
    public Iterable<Supplier> getList() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void delete(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier findById(Long id) {
        return supplierRepository.findById(id).get();
    }
}