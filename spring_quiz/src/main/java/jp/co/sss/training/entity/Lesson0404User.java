package jp.co.sss.training.entity;

public class Lesson0404User {

	private long id;
	private String userId;
	private long departmentId;

	public Lesson0404User() {

	}

	public Lesson0404User(String userId, int departmentId) {
		this.userId = userId;
		this.departmentId = departmentId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

}
