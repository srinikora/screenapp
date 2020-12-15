package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="eligible_status")
public class EligibleStatusEntity {

	public EligibleStatusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String eligibleStatusCd;
	@NotNull
	private String eligibleStatus;
	private String invalidInd;
	
	public String getEligibleStatusCd() {
		return eligibleStatusCd;
	}
	public void setEligibleStatusCd(String eligibleStatusCd) {
		this.eligibleStatusCd = eligibleStatusCd;
	}
	public String getEligibleStatus() {
		return eligibleStatus;
	}
	public void setEligibleStatus(String eligibleStatus) {
		this.eligibleStatus = eligibleStatus;
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
		result = prime * result + ((eligibleStatus == null) ? 0 : eligibleStatus.hashCode());
		result = prime * result + ((eligibleStatusCd == null) ? 0 : eligibleStatusCd.hashCode());
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
		EligibleStatusEntity other = (EligibleStatusEntity) obj;
		if (eligibleStatus == null) {
			if (other.eligibleStatus != null)
				return false;
		} else if (!eligibleStatus.equals(other.eligibleStatus))
			return false;
		if (eligibleStatusCd == null) {
			if (other.eligibleStatusCd != null)
				return false;
		} else if (!eligibleStatusCd.equals(other.eligibleStatusCd))
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
		return "EligibleStatusEntity [eligibleStatusCd=" + eligibleStatusCd + ", eligibleStatus=" + eligibleStatus
				+ ", invalidInd=" + invalidInd + "]";
	}
	
	

}
