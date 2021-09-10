package com.octans.prueba.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;


/**
 * @author manuel.rodriguez
 *
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {
	 private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       

    @NotEmpty(message = "No puede estar vacio")
    @Size(min = 3, max = 20, message = "el tamaño debe estar entre 3 y 20 caracteres")
    @Column(unique = true, nullable = false)
    private String nombre;
    
    
    private Boolean estado;
    
    
    @Column(name = "create_at", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date createAt;
    
 // < -- crear la fecha en automatico-->
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    
    
    // < -- metodos get y set Fin-->
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public Date getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
    
   
    
   
      
  

	
    
    
	 // < -- metodos get y set Fin-->
}
