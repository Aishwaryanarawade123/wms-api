package com.pbh.wms.service;

import com.pbh.wms.model.Order;
import com.pbh.wms.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Order> getAll() {
        return repo.findAll();
    }

    public Order getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Order save(Order order) {
        return repo.save(order);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
