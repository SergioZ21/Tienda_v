package com.tienda.service;

import com.tienda.dao.CategoriaDao;
import org.springframework.stereotype.Service;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao clienteDao;
    
    
    @Override
    @Transactional
    public List<Categoria> getCategorias(boolean activos){
        var lista= (List<Categoria>) clienteDao.findAll();
        if (activos) {lista.removeIf(e -> e.isActiva()); }
       
        return lista;
        
    }

    @Override
    @Transactional
    public void save(Categoria cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Categoria cliente) {
      clienteDao.delete(cliente);
    }

    @Override
    @Transactional
    public Categoria getCategoria(Categoria cliente) {
        return clienteDao.findById(cliente.getIdCategoria()).orElse(null);
    }
        
    
}