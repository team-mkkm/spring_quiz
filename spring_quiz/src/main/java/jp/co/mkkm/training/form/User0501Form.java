package jp.co.mkkm.training.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User0501Form {
	
	@Size(max = 10, min = 1, message = "1文字以上10文字以下で入力してください") 
	@Pattern(regexp = "^[a-z][a-z0-9]*$", message = "小文字アルファベットまたは数字を入力してください。先頭には数字は使えません") 
	private String userId;
	 
	@Size(max = 10, min = 1, message = "1文字以上10文字以下で入力してください") 
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
