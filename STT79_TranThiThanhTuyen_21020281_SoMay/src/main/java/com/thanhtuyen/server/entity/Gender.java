package com.thanhtuyen.server.entity;

public enum Gender implements java.io.Serializable{
	MALE("Male"), FEMALE("Female"), ORDER ("Order");
	private String name;
	private Gender(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
