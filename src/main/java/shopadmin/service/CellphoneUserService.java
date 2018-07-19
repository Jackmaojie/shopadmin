package shopadmin.service;

import java.util.List;

import shopadmin.model.CellphoneUser;

public interface CellphoneUserService {
	
	CellphoneUser findOne(Long id);
	
	List<CellphoneUser> findAll();
}
