package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shopadmin.mapper.CellphoneOrderMapper;
import shopadmin.model.CellphoneOrder;
import shopadmin.service.CellphoneOrderService;

@Service
@Transactional
public class CellphoneOrderServiceImpl implements CellphoneOrderService {
	
	private CellphoneOrderMapper cellphoneOrderMapper;
	
	@Autowired
	public CellphoneOrderServiceImpl(CellphoneOrderMapper cellphoneOrderMapper) {
		this.cellphoneOrderMapper = cellphoneOrderMapper;
	}


	@Override
	public List<CellphoneOrder> findAllOrder() {
		return cellphoneOrderMapper.findAllOrder();
	}


	@Override
	public CellphoneOrder findOneOrder(Integer id) {
		return cellphoneOrderMapper.findOneOrder(id);
	}

}
