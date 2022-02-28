package com.tienda.service;

import com.tienda.dao.ClienteDao;
import org.springframework.stereotype.Service;
import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteDao clienteDao;
    
    
    @Override
    public List<Cliente> getClientes(){
        
        return (List<Cliente>)clienteDao.findAll();
        
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
      clienteDao.delete(cliente);
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
        
    
}