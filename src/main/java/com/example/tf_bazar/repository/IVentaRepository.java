package com.example.tf_bazar.repository;

import com.example.tf_bazar.model.Producto;
import com.example.tf_bazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
