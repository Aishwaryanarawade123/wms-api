package com.pbh.wms.service;

import com.pbh.wms.model.Inventory;
import com.pbh.wms.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository repo;

    public InventoryService(InventoryRepository repo) {
        this.repo = repo;
    }

    public List<Inventory> getAll() {
        return repo.findAll();
    }

    public Inventory getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Inventory save(Inventory inventory) {
        return repo.save(inventory);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
