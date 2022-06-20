package com.example.tf_bazar.controller;

import com.example.tf_bazar.model.Cliente;
import com.example.tf_bazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService serviCliente;


    @GetMapping("clientes")
    public List<Cliente> listarClientes(){

        return serviCliente.getClientes();
    }
    @PostMapping("/clientes/crear")
    public String crearCliente(@RequestBody Cliente cliente){
        serviCliente.saveCliente(cliente);
        return "Los datos fueron almacenados Correctamente";
    }
    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public String borrarCliente(@PathVariable Long id_cliente){
        serviCliente.deleteCliente(id_cliente);
        return "El cliente fue eliminado con exito";
    }

    @PutMapping("/clientes/editar/{id_original}")
    public Cliente editarCliente(@PathVariable Long id_original,
                                 @RequestParam (required = false, name="id_cliente") Long id_nuevoCliente,
                                 @RequestParam (required = false, name="nombre") String nuevoNombre,
                                 @RequestParam (required = false, name="apellido") String nuevoApellido,
                                 @RequestParam (required = false, name="dni") String  nuevoDni
    ){
        serviCliente.editCliente(id_original,id_nuevoCliente,nuevoNombre,nuevoApellido,nuevoDni);
        Cliente cliente= serviCliente.findCliente(id_nuevoCliente);
        return cliente;

    }
}
