package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="key_personnel_title")
public class KeyPersonnelTitleEntity {

	public KeyPersonnelTitleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String keyPersonnelTitleCd;
	@NotNull
	private String keyPersonnelTitle;
	
	public String getKeyPersonnelTitleCd() {
		return keyPersonnelTitleCd;
	}
	public void setKeyPersonnelTitleCd(String keyPersonnelTitleCd) {
		this.keyPersonnelTitleCd = keyPersonnelTitleCd;
	}
	public String getKeyPersonnelTitle() {
		return keyPersonnelTitle;
	}
	public void setKeyPersonnelTitle(String keyPersonnelTitle) {
		this.keyPersonnelTitle = keyPersonnelTitle;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keyPersonnelTitle == null) ? 0 : keyPersonnelTitle.hashCode());
		result = prime * result + ((keyPersonnelTitleCd == null) ? 0 : keyPersonnelTitleCd.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyPersonnelTitleEntity other = (KeyPersonnelTitleEntity) obj;
		if (keyPersonnelTitle == null) {
			if (other.keyPersonnelTitle != null)
				return false;
		} else if (!keyPersonnelTitle.equals(other.keyPersonnelTitle))
			return false;
		if (keyPersonnelTitleCd == null) {
			if (other.keyPersonnelTitleCd != null)
				return false;
		} else if (!keyPersonnelTitleCd.equals(other.keyPersonnelTitleCd))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "KeyPersonnelTitle [keyPersonnelTitleCd=" + keyPersonnelTitleCd + ", keyPersonnelTitle="
				+ keyPersonnelTitle + "]";
	}
	
	

}
