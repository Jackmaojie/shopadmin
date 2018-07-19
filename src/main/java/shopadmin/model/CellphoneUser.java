package shopadmin.model;


public class CellphoneUser {
	private Long id;
	private String username;
	private Gender gender;
	private String lastdate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getLastdate() {
		return String.valueOf(lastdate);
	}
	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}
	
	
}
