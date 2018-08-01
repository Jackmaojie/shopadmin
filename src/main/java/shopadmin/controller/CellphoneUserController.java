package shopadmin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.CellphoneUser;
import shopadmin.service.CellphoneUserService;



@Controller
public class CellphoneUserController {
	
	private CellphoneUserService cellphoneUserService;

	public CellphoneUserController(CellphoneUserService cellphoneUserService) {
		this.cellphoneUserService = cellphoneUserService;
	}
	//-----------------------用户列表----------------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphoneUsers/")
	public String list(Model model){
		List<CellphoneUser> cellphoneUsers=cellphoneUserService.findAll();
		model.addAttribute("cellphoneUsers", cellphoneUsers);
		return "cellphoneuser-list";
	}
	//=====================================================================================================
	//----------------------用户详情-------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphoneUsers/{id}")
	public String details(@PathVariable Long id,Model model){
		CellphoneUser cellphoneUser=cellphoneUserService.findOne(id);
		model.addAttribute("cellphoneUser", cellphoneUser);	
		return "cellphoneuser-details";
		
	}

}















