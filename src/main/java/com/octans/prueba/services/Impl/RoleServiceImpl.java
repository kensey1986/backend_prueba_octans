package com.octans.prueba.services.Impl;

import java.awt.print.Pageable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.octans.prueba.entity.Role;
import com.octans.prueba.models.dao.IRoleDao;
import com.octans.prueba.services.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private IRoleDao roleDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Role> findAll() {
		return (List<Role>) roleDao.findAll();
	}

	
	
	@Override
	@Transactional(readOnly = true)
	public Role findById(Long id) {
		return roleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Role save(Role Role) {
		return roleDao.save(Role);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		roleDao.deleteById(id);
	}



	

}
