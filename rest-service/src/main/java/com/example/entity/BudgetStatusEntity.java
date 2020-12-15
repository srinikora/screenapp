package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="budget_status")
public class BudgetStatusEntity {

	public BudgetStatusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String budgetStatusCd;
	@NotNull
	private String budgetStatus;
	private String invalidInd;
	
	public String getBudgetStatusCd() {
		return budgetStatusCd;
	}
	public void setBudgetStatusCd(String budgetStatusCd) {
		this.budgetStatusCd = budgetStatusCd;
	}
	public String getBudgetStatus() {
		return budgetStatus;
	}
	public void setBudgetStatus(String budgetStatus) {
		this.budgetStatus = budgetStatus;
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
		result = prime * result + ((budgetStatus == null) ? 0 : budgetStatus.hashCode());
		result = prime * result + ((budgetStatusCd == null) ? 0 : budgetStatusCd.hashCode());
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
		BudgetStatusEntity other = (BudgetStatusEntity) obj;
		if (budgetStatus == null) {
			if (other.budgetStatus != null)
				return false;
		} else if (!budgetStatus.equals(other.budgetStatus))
			return false;
		if (budgetStatusCd == null) {
			if (other.budgetStatusCd != null)
				return false;
		} else if (!budgetStatusCd.equals(other.budgetStatusCd))
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
		return "BudgetStatusEntity [budgetStatusCd=" + budgetStatusCd + ", budgetStatus=" + budgetStatus
				+ ", invalidInd=" + invalidInd + "]";
	}
	
	

}
