
package com.octans.prueba.models.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.octans.prueba.entity.Usuario;



public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	
	
	

}
