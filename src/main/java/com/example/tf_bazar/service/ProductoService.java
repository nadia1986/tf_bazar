package com.example.tf_bazar.service;


import com.example.tf_bazar.model.Producto;
import com.example.tf_bazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public List<Producto> getProductos() {
        List<Producto> listarProductos = repoProducto.findAll();
        return listarProductos;
    }

    @Override
    public void saveProducto(Producto nuevoProducto) {
        repoProducto.save(nuevoProducto);

    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        repoProducto.deleteById(codigo_producto);

    }

    @Override
    public Producto findProducto(Long codigo_producto) {
        return repoProducto.findById(codigo_producto).orElse(null);
    }

    @Override
    public void editProducto(Long codOriginal, Long nuevo_codigo,
                             String nuevoNombre,
                             String nuevaMarca,
                             Double nuevoCosto,
                             Double nuevoStock) {

        Producto productoModif= this.findProducto(codOriginal);
        productoModif.setCodigo_producto(nuevo_codigo);
        productoModif.setNombre(nuevoNombre);
        productoModif.setMarca(nuevaMarca);
        productoModif.setCosto(nuevoCosto);
        productoModif.setCant_disponible(nuevoStock);

        this.saveProducto(productoModif);
    }

    @Override
    public List<Producto> getStock() {
        List<Producto> listaProductos = this.getProductos();
        List<Producto> listaFaltaStock = new ArrayList<Producto>();


        for (Producto prod :listaProductos) {
            if (prod.getCant_disponible()  <=5.0) {
                listaFaltaStock.add(prod);
            }
        }
        return listaFaltaStock;
    }


}
