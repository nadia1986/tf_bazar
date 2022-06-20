package com.example.tf_bazar.service;

import com.example.tf_bazar.model.Cliente;
import com.example.tf_bazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteRepository repoCliente;

    @Override
    public List<Cliente> getClientes() {
        List<Cliente> listarClientes= repoCliente.findAll();
        return listarClientes;
    }

    @Override
    public void saveCliente(Cliente nuevoCliente) {
        repoCliente.save(nuevoCliente);

    }

    @Override
    public void deleteCliente(Long id_cliente) {
        repoCliente.deleteById(id_cliente);

    }

    @Override
    public Cliente findCliente(Long id_cliente) {

    return repoCliente.findById(id_cliente).orElse(null);

    }

    @Override
    public void editCliente(Long idOriginal, Long id_nuevoCliente,
                            String nuevoNombre,
                            String nuevoApellido,
                            String nuevoDni) {
        Cliente cliente = this.findCliente(idOriginal);
        cliente.setId_cliente(id_nuevoCliente);
        cliente.setNombre(nuevoNombre);
        cliente.setApellido(nuevoApellido);
        cliente.setDni(nuevoDni);

        this.saveCliente(cliente);

    }
}
