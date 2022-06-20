package com.example.tf_bazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long codigo_producto;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cant_disponible;
   // @ManyToOne
   // @JoinColumn(name= "codigo_venta")
    @ManyToMany(mappedBy = "productos")
    private List<Venta> ventas;

    public Producto( Long codigo_producto,String nombre, String marca,Double costo,Double cant_disponible, List<Venta> ventas) {
        this.codigo_producto= codigo_producto;
        this.nombre= nombre;
        this.marca= marca;
        this.costo= costo;
        this.cant_disponible= cant_disponible;
        this.ventas= ventas;
    }


}
