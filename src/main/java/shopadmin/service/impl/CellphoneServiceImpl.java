package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.exception.NameExistsException;
import shopadmin.mapper.CellphoneMapper;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService {
	
	private CellphoneMapper cellphoneMapper;
	
	@Autowired
	public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
		this.cellphoneMapper = cellphoneMapper;
	}

	@Override
	public List<Cellphone> findAll() {
		return cellphoneMapper.findAll();
	}

	@Override
	public Cellphone findOne(String id) {
		
		return cellphoneMapper.findOne(id);
	}

	@Override
	public void create(Cellphone cellphone) {
		if(cellphoneMapper.nameExists(cellphone.getModel())>0){
			throw new NameExistsException();
		}
		cellphoneMapper.create(cellphone);
	}

	@Override
	public void delete(String id) {
		cellphoneMapper.delete(id);

	}

	@Override
	public void update(Cellphone cellphone) {
		cellphoneMapper.update(cellphone);

	}

}
