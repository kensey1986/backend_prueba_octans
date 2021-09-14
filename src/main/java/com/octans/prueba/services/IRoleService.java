package com.octans.prueba.services;

import java.util.List;




import com.octans.prueba.entity.Role;



public interface IRoleService {

	public List<Role> findAll();
	
	
	
	public Role findById(Long id);
	
	public Role save(Role Region);
	
	public void delete(Long id);
	
	

}
