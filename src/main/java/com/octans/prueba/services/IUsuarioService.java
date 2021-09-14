
package com.octans.prueba.services;


import java.util.List;
import com.octans.prueba.entity.Usuario;

public interface IUsuarioService {

	
	
	public List<Usuario> findAll();
	
		
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	public List<Usuario> findByNombre(String term);
	
	
	
	
	
	
}
