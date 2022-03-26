package com.tienda.domain;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import javax.persistence.Column;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCredito;
    private Long limite;
  
    
    public Credito(){
    }

    public Credito(Long idCredito, Long limite) {
       
        this.limite = limite;
    }
    
    
    
    
}
