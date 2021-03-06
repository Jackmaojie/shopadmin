package shopadmin.model;

import java.util.ArrayList;
import java.util.List;

/**
 *手机订单类
 */
public class CellphoneOrder {
	
	private Integer id;
	private CellphoneUser cellphoneUser;
	private ReceivingAddress receivingAddress;
	private String createtime;
	private List<OrderItem> orderItems=new ArrayList<OrderItem>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CellphoneUser getCellphoneUser() {
		return cellphoneUser;
	}
	public void setCellphoneUser(CellphoneUser cellphoneUser) {
		this.cellphoneUser = cellphoneUser;
	}
	public ReceivingAddress getReceivingAddress() {
		return receivingAddress;
	}
	public void setReceivingAddress(ReceivingAddress receivingAddress) {
		this.receivingAddress = receivingAddress;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public int totalCost(){
		int result=0;
		for(OrderItem item:orderItems){
			result+=item.getAmount() * item.getCellphone().getPrice();
		}
		return result;
	}
}
