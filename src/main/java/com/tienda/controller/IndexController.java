package com.tienda.controller;

import lombok.extern.slf4j.Slf4j;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.tienda.dao.ClienteDao;
import com.tienda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora estamos con arquitectura mvc");
        
        
        var clientes= clienteService.getClientes();
        model.addAttribute("clientes",clientes);
        return "index";
        
        
    }
        
}
