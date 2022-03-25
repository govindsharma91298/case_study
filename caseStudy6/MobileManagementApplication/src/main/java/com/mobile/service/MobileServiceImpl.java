package com.mobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

//this is the service implementation class in which i created one dao interface object and initialized by autowire annotation
@Service
@Transactional
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileDao dao;

	@Override
	public Mobile addMobile(Mobile m) {
	
		return dao.save(m); //save method is in crudrepository to add details we didn't create doaimplementation in this project
	}

	@Override
	public Mobile updateMobile(Mobile m) {
		
		return dao.save(m);//this save is also used to update data and found in crud repository
	}

	@Override
	public void deleteMobile(int id) {
		
		 dao.deleteById(id);//this method is used to delete entities by id and it returns void and print null if there is no mobile
	}

	@Override
	public Optional<Mobile> getMobile(int id) {
		
		return dao.findById(id);//this is used to find mobile by id
	}

	@Override
	public Iterable<Mobile> getAllMobile() {
		
		return dao.findAll();//used to find all entities
	}
	
	

	
	
}
