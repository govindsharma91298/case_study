package com.mobile.service;

import java.util.List;
import java.util.Optional;
//this is a interface of service in which differnt methods are created
import com.mobile.entity.Mobile;

public interface MobileService {
	
	Mobile addMobile(Mobile m);
	Mobile updateMobile(Mobile m);
	void deleteMobile(int id);
	Optional<Mobile> getMobile(int id);
	Iterable<Mobile> getAllMobile();
	

}
