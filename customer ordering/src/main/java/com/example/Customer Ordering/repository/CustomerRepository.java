package com.example.springdatajpamapping.repository;

import com.example.springdatajpamapping.dto.OrderResponse;
import com.example.springdatajpamapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select new com.example.springdatajpamapping.dto.OrderResponse(c.name, p.name) from customers c join c.products p")
    public List<OrderResponse> getJoinInformation();
}
