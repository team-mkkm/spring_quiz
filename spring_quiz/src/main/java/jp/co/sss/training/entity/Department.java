package jp.co.sss.training.entity;

public class Department {

	private long id;
	private String name;

	public Department() {

	}

	public Department(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
