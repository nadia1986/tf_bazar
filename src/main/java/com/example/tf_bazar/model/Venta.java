package com.example.tf_bazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Getter @Setter
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long cod_venta;
    private LocalDate fecha_venta;
    private Double total;

    //@OneToMany(mappedBy = "venta")
    @ManyToMany
    @JoinTable(
            name= "rel_venta_producto",
            joinColumns = @JoinColumn( name= "id_venta",nullable = false),
            inverseJoinColumns = @JoinColumn(name= "cod_producto", nullable = false)
    )
    private List<Producto> productos;

    @OneToOne
    @JoinColumn(name= "idCliente",
                referencedColumnName = "id_cliente" )
    private Cliente unCliente;

    public Venta(Long cod_venta,LocalDate fecha_venta, Double total,List<Producto> productos,Cliente unCliente) {
        this.cod_venta= cod_venta;
        this.fecha_venta= fecha_venta;
        this.total= total;
        this.productos= productos;
        this.unCliente= unCliente;
    }


}
