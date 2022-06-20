package com.example.tf_bazar.repository;

import com.example.tf_bazar.model.Cliente;
import com.example.tf_bazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}
