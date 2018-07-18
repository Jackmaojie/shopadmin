package shopadmin.mapper;

import java.util.List;

import shopadmin.model.Cellphone;

public interface CellphoneMapper {
	
	List<Cellphone> findAll();
	
	Cellphone findOne(String id);
	
	void create (Cellphone cellphone);
	
	void delete (String id);
	
	void update (Cellphone cellphone);

	Integer nameExists(String model);

}
