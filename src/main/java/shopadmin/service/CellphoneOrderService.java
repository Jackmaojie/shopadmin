package shopadmin.service;

import java.util.List;

import shopadmin.model.CellphoneOrder;

public interface CellphoneOrderService {

	List<CellphoneOrder> findAllOrder();

	CellphoneOrder findOneOrder(Integer id);

}
