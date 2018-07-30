package shopadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.CellphoneOrder;
import shopadmin.service.CellphoneOrderService;

@Controller
public class CellphoneOrderController {
	
	private CellphoneOrderService cellphoneOrderService;
	@Autowired
	public CellphoneOrderController(CellphoneOrderService cellphoneOrderService) {
		this.cellphoneOrderService = cellphoneOrderService;
	}
	//----------------------订单列表---------------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphoneOrders/")
	public String list(Model model){
		List<CellphoneOrder> cellphoneOrders=cellphoneOrderService.findAllOrder();
		model.addAttribute("cellphoneOrders", cellphoneOrders);
		return "cellphoneorder-list";
	}
	//===============================================================================================
	//----------------------订单详情----------------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphoneOrders/{id}")
	public String orderDetails(@PathVariable Integer id,Model model){
		
		CellphoneOrder cellphoneOrder=cellphoneOrderService.findOneOrder(id);
		
		System.out.println("cellphoneOrder"+cellphoneOrder.getCreatetime());
		model.addAttribute("cellphoneOrder",cellphoneOrder );

		return "cellphoneorder-details";
	}
	//===============================================================================================
}
