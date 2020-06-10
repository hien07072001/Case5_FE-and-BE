package com.codegym.casemodul5.controller;

import com.codegym.casemodul5.model.Material;
import com.codegym.casemodul5.service.material.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class MaterialController {
    @Autowired
    private MaterialService materialService;
    @GetMapping("/material")
    public ResponseEntity<List<Material>> getList(){
        List<Material> materials = (List<Material>) materialService.getList();
        return  new ResponseEntity<>(materials, HttpStatus.OK);
    }

    @PostMapping("/material/create")
    public ResponseEntity<Void> addActivity(@RequestBody Material material){
        materialService.save(material);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/material/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id){
        materialService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/material/update")
    public ResponseEntity<Material> updateActivity(@RequestBody Material material){
        materialService.save(material);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
