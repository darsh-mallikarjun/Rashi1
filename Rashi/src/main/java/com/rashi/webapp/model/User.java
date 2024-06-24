package com.rashi.webapp.model;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user" , uniqueConstraints =@UniqueConstraint(columnNames= "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	private String name;
	
	private String email;
	
	
	private String password;
	
	
	private String mobile;
	
	
	@ManyToMany(fetch = FetchType.EAGER  , cascade = CascadeType.ALL)
	@JoinTable(name="user_roles" , 
		joinColumns =@JoinColumn(
				name="user_roles" , referencedColumnName ="id"	),
	inverseJoinColumns =@JoinColumn(
			name="role_id" , referencedColumnName ="id"	))
	
	private Collection<Role> roles;
	
	public User() {
		
	}

	public User(String name, String email, String password, String mobile, Collection<Role> roles) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.roles = roles;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}
