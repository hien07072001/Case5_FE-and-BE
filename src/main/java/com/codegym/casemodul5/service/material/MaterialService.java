package com.codegym.casemodul5.service.material;

import com.codegym.casemodul5.model.Material;

public interface MaterialService {

    Iterable<Material> getList();

    Material save(Material material);

    void delete(Long id);

    Material findById(Long id);
}
