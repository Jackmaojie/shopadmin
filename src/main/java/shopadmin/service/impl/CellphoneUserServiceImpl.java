package shopadmin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneUserMapper;
import shopadmin.model.CellphoneUser;
import shopadmin.service.CellphoneUserService;

@Service
public class CellphoneUserServiceImpl implements CellphoneUserService {
	
	private CellphoneUserMapper cellphoneUserMapper;
	
	
	public CellphoneUserServiceImpl(CellphoneUserMapper cellphoneUserMapper) {
		this.cellphoneUserMapper = cellphoneUserMapper;
	}

	@Override
	public CellphoneUser findOne(Long id) {
		//CellphoneUser cellphoneUser=cellphoneUserMapper.findOne(id);
		//cellphoneUserMapper.updatelastdate(cellphoneUser);
		System.out.println("--------------"+id);
		return cellphoneUserMapper.findOne(id);
	}

	@Override
	public List<CellphoneUser> findAll() {

		return cellphoneUserMapper.findAll();
	}

}
