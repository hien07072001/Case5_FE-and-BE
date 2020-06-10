package com.codegym.casemodul5.controller;

import com.codegym.casemodul5.model.Material;
import com.codegym.casemodul5.model.Supplier;
import com.codegym.casemodul5.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")

public class SupplierController {
    @Autowired
    SupplierService supplierService;
    @GetMapping("/supplier")
    public ResponseEntity<List<Supplier>> getList(){
        List<Supplier> suppliers = (List<Supplier>) supplierService.getList();
        return  new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

    @PostMapping("/supplier/create")
    public ResponseEntity<Void> addActivity(@RequestBody Supplier supplier){
        supplierService.save(supplier);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/supplier/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id){
        supplierService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/supplier/update")
    public ResponseEntity<Material> updateActivity(@RequestBody Supplier supplier){
        supplierService.save(supplier);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
