package jp.co.mkkm.training.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User0502Form {
	
	@Size(max = 10, min = 1) 
	@Pattern(regexp = "^[a-z][a-z0-9]*$") 
	private String userId;
	 
	@Size(max = 10, min = 1) 
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
