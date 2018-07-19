package shopadmin.mapper;

import java.util.List;

import shopadmin.model.CellphoneUser;

public interface CellphoneUserMapper {
	
	List<CellphoneUser> findAll();
	
	CellphoneUser findOne(Long id);
	
	
}
