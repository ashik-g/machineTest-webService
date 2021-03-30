package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Request;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer>{

}
