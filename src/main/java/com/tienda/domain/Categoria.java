package com.tienda.domain;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private boolean activa;
    
    
    
   
    
    
    public Categoria(){
    }

    public Categoria(String descripcion, boolean activa) {
        this.descripcion = descripcion;
        this.activa = activa;
    }
    
    
    
    
}
