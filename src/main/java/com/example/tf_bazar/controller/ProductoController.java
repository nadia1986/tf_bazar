package com.example.tf_bazar.controller;

import com.example.tf_bazar.model.Cliente;
import com.example.tf_bazar.model.Producto;
import com.example.tf_bazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService serviProducto;


    @GetMapping("/productos")
    public List<Producto> listarProductos(){

        return serviProducto.getProductos();
    }
    @PostMapping("/productos/crear")
    public String crearProducto(@RequestBody Producto unProducto){
        serviProducto.saveProducto(unProducto);
        return "Los datos fueron almacenados Correctamente";
    }
    @DeleteMapping("/productos/eliminar/{cod_producto}")
    public String borrarProducto(@PathVariable Long cod_producto){
        serviProducto.deleteProducto(cod_producto);
        return "El producto fue eliminado con exito";
    }

    @PutMapping("/productos/editar/{codOriginal}")
    public Producto editarProducto (@PathVariable Long codOriginal,
                                    @RequestParam (required = false, name="codigo_producto") Long nuevoCodigo,
                                    @RequestParam (required = false, name="nombre") String nuevoNombre,
                                    @RequestParam (required = false, name="marca") String nuevaMarca,
                                    @RequestParam (required = false, name="costo") Double  nuevoCosto,
                                    @RequestParam(required = false, name="cant_disponible") Double nuevoStock
    ){
        serviProducto.editProducto(codOriginal,nuevoCodigo,nuevoNombre,nuevaMarca,nuevoCosto, nuevoStock);
        Producto productoEditado= serviProducto.findProducto(nuevoCodigo);
        return productoEditado ;

    }

    //trae productos con stock menor o igual  a 5
    @GetMapping("/productos/falta_stock")
    public List<Producto> traerProductos() {
        return serviProducto.getStock();
    }
}
