package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="ineligible_category")
public class IneligibleCategoryEntity {

	public IneligibleCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String ineligibleCatCd;
	@NotNull
	private String ineligibleCategory;
	private String invalidInd;
	public String getIneligibleCatCd() {
		return ineligibleCatCd;
	}
	public void setIneligibleCatCd(String ineligibleCatCd) {
		this.ineligibleCatCd = ineligibleCatCd;
	}
	public String getIneligibleCategory() {
		return ineligibleCategory;
	}
	public void setIneligibleCategory(String ineligibleCategory) {
		this.ineligibleCategory = ineligibleCategory;
	}
	public String getInvalidInd() {
		return invalidInd;
	}
	public void setInvalidInd(String invalidInd) {
		this.invalidInd = invalidInd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ineligibleCatCd == null) ? 0 : ineligibleCatCd.hashCode());
		result = prime * result + ((ineligibleCategory == null) ? 0 : ineligibleCategory.hashCode());
		result = prime * result + ((invalidInd == null) ? 0 : invalidInd.hashCode());
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
		IneligibleCategoryEntity other = (IneligibleCategoryEntity) obj;
		if (ineligibleCatCd == null) {
			if (other.ineligibleCatCd != null)
				return false;
		} else if (!ineligibleCatCd.equals(other.ineligibleCatCd))
			return false;
		if (ineligibleCategory == null) {
			if (other.ineligibleCategory != null)
				return false;
		} else if (!ineligibleCategory.equals(other.ineligibleCategory))
			return false;
		if (invalidInd == null) {
			if (other.invalidInd != null)
				return false;
		} else if (!invalidInd.equals(other.invalidInd))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IneligibleCategoryEntity [ineligibleCatCd=" + ineligibleCatCd + ", ineligibleCategory="
				+ ineligibleCategory + ", invalidInd=" + invalidInd + "]";
	}
	
	

}
