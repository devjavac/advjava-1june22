package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // to define class as a Entity Class
public class Student { 
	
	private int id;
	private String name;
	@Id // to make the filed as a primary key
	private String email;
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
