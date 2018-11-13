package com.rohit.bootpsqlheroku.model;

import javax.persistence.*;

@Entity
@Table(name="application_user")
@SequenceGenerator(name="ApplicationUserIdSequence", sequenceName="application_user_id_seq", allocationSize=1)
public class ApplicationUser {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ApplicationUserIdSequence")
	private long id;

	@Column(name = "full_name")
	private String fullName;

	@Column(name="email")
	private String email;

	public ApplicationUser() {}

	public ApplicationUser(String fullName, String email) {
		this.fullName = fullName;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
