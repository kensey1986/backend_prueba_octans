
package com.octans.prueba.models.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.octans.prueba.entity.Usuario;



public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	
	
	@Query("select p from Usuario p where (p.nombre) like %?1%")
	public List<Usuario> findByNombre(String term);

}
