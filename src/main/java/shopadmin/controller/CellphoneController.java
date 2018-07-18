package shopadmin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.controller.form.CellphoneForm;
import shopadmin.exception.NameExistsException;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Controller
public class CellphoneController {
	
	private CellphoneService cellphoneService;
	@Autowired	
	public CellphoneController(CellphoneService cellphoneService) {
		this.cellphoneService = cellphoneService;
	}
	//-----------------------------列表-----------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/")
	public String list(Model model){
		List<Cellphone> cellphones=cellphoneService.findAll();
		model.addAttribute("cellphones", cellphones);
		return "cellphone-list";
	}
	//================================================================================================
	//-----------------------------详情---------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/{id}")
	public String details(@PathVariable String id,Model model){
		Cellphone cellphone=cellphoneService.findOne(id);
		model.addAttribute("cellphone", cellphone);
		return "cellphone-details";
		
	}
	//==============================================================================
	//------------------------------add-------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/add")
	public String add(@ModelAttribute CellphoneForm cellphoneForm,Model model){
		prepareInAdd(model);	
		return "cellphone-edit";
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/cellphones/add")
	public String create(@ModelAttribute @Valid CellphoneForm cellphoneForm,
						BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			prepareInAdd(model);
			return "cellphone-edit";
		}
		try{
			cellphoneService.create(cellphoneForm.tocellphone());
		}catch(NameExistsException ex){
            System.out.println(ex.getMessage());
            bindingResult.rejectValue( // 手动添加校验错误
                    "name", // 指定错误字段
                    "form.cellphone.nameExists", // 错误码, i18n（国际化）
                    "用户名已占用"); // 如果错误码对应的消息没有找到，则使用此默认消息
			return "cellphone-add";
		}	
		return "redirect:/cellphones/";
		
		
	}
	//==================================================================================
	
	private void prepareInAdd(Model model) {
		List<Cellphone> cellphoneOptions=cellphoneService.findAll();
		model.addAttribute("cellphoneOptions", cellphoneOptions);
	}
	//=====================================================================================
	//-----------------------edit-------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/{id}/edit")
	public String edit(@ModelAttribute CellphoneForm cellphoneForm ,@PathVariable String id,Model model){
		Cellphone cell=cellphoneService.findOne(id);
		CellphoneForm cellphoneForm1=CellphoneForm.fromcellphone(cell);
		model.addAttribute("cellphoneForm", cellphoneForm1);
		prepareInAdd(model);
		return "cellphone-edit";
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/cellphones/{id}/edit")
	public String update(@PathVariable String id,@ModelAttribute @Valid
						CellphoneForm cellphoneForm,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			prepareInAdd(model);
			return "cellphone-edit";
		}
		Cellphone cellphone=cellphoneForm.tocellphone();
		cellphoneService.update(cellphone);
		return "redirect:/cellphones/";
	}
	//==========================================================================================
	//----------------------------delete-----------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/{id}/delete")
	public String delete(@PathVariable String id){
		cellphoneService.delete(id);
		return "redirect:/cellphones/";
		
	}	
}
