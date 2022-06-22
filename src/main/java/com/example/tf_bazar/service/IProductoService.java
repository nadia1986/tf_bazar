package com.example.tf_bazar.service;

import com.example.tf_bazar.model.Cliente;
import com.example.tf_bazar.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getProductos();
    void saveProducto(Producto nuevoProducto);
    public void deleteProducto(Long codigo_producto);
    public Producto findProducto(Long codigo_producto);
    void editProducto(Long codOriginal, Long nuevo_codigo,String nuevoNombre, String nuevaMarca,Double nuevoCosto, Double  nuevoStock);
    List<Producto> getStock();
}
