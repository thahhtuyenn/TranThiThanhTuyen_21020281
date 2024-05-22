package com.thanhtuyen.server.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public class Person implements Serializable {
	@Id
	@Column(name = "person_id")
	private String id;
	@Column(name = "full_name")
	private String fullName;

	// Thuộc tính enum
	@Enumerated(EnumType.STRING)
	private Gender gender;

	// Nhiều người được quản lý bởi một người
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Person manager;

	// Thuộc tính đa trị: chỉ có string, int, ...
	// nếu là đối tượng thì là OneToMany
	// C1: @ElementCollection
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "phones", joinColumns = @JoinColumn(name = "person_id"))
	@Column(name = "phone")
	private List<String> phones;

	public Person(String id, String fullName, Gender gender, Person manager, List<String> phones) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.manager = manager;
		this.phones = phones;
	}

	public Person() {
		super();
	}

	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public Person getManager() {
		return manager;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", manager=" + manager
				+ ", phones=" + phones + "]";
	}

}
