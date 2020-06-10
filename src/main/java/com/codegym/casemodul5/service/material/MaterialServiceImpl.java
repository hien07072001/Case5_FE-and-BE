package com.codegym.casemodul5.service.material;

import com.codegym.casemodul5.model.Material;
import com.codegym.casemodul5.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialRepository materialRepository;

    @Override
    public Iterable<Material> getList() {
        return materialRepository.findAll();
    }

    @Override
    public Material save(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public void delete(Long id) {
        materialRepository.deleteById(id);
    }

    @Override
    public Material findById(Long id) {
        return materialRepository.findById(id).get();
    }
}
