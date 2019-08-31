package com.ht.entity.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin_users")
public class AdminUsersEntity {
	
	@Id
	int pk;
	
	@Column
	String firstName;
	
	@Column
	String lastName;
	
	@Column
	String email;
	
	@Column
	String phone;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_admin_clients", nullable=false)
	private AdminClientsEntity fkAdminClients ;

	public AdminClientsEntity getFkAdminClients() {
		return fkAdminClients;
	}

	public void setFkAdminClients(AdminClientsEntity fkAdminClients) {
		this.fkAdminClients = fkAdminClients;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
