package com.faith.app.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Login;
@Repository
public interface LoginRepository extends CrudRepository<Login, Integer>{

	@Transactional

	@Query("from Login where username=?1 and password=?2")
	public Login findByUsernameAndPassword(String fullname, String password);
}
