package com.example.tf_bazar.service;

import com.example.tf_bazar.model.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> getClientes();
    void saveCliente(Cliente nuevoCliente);
    public void deleteCliente(Long id_cliente);
    public Cliente findCliente(Long id_cliente);
    void editCliente(Long idOriginal, Long id_nuevoCliente,String nuevoNombre, String nuevoApellido,    String nuevoDni);

    //void editPersona(Cliente cliente);
}
