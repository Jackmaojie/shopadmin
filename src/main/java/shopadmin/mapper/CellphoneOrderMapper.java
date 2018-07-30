package shopadmin.mapper;

import java.util.List;

import shopadmin.model.CellphoneOrder;

public interface CellphoneOrderMapper {

	List<CellphoneOrder> findAllOrder();

	CellphoneOrder findOneOrder(Integer id);

}
