package com.octans.prueba.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.octans.prueba.entity.Role;

public interface IRoleDao extends JpaRepository<Role, Long> {

	/*
	 * @Query("from Region") public List<Region> findAllRegiones();
	 */
}
