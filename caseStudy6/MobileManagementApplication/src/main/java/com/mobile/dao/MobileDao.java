package com.mobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;

//here we replaced daoimplementation by crudrepository

public interface MobileDao extends CrudRepository<Mobile, Integer> {

}
