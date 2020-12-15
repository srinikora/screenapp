package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="grant_funding_status")
public class GrantFundingStatusEntity {

	public GrantFundingStatusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String grantFundingStatusCd;
	@NotNull
	private String grantFundingStatus;
	private String invalidInd;
	public String getGrantFundingStatusCd() {
		return grantFundingStatusCd;
	}
	public void setGrantFundingStatusCd(String grantFundingStatusCd) {
		this.grantFundingStatusCd = grantFundingStatusCd;
	}
	public String getGrantFundingStatus() {
		return grantFundingStatus;
	}
	public void setGrantFundingStatus(String grantFundingStatus) {
		this.grantFundingStatus = grantFundingStatus;
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
		result = prime * result + ((grantFundingStatus == null) ? 0 : grantFundingStatus.hashCode());
		result = prime * result + ((grantFundingStatusCd == null) ? 0 : grantFundingStatusCd.hashCode());
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
		GrantFundingStatusEntity other = (GrantFundingStatusEntity) obj;
		if (grantFundingStatus == null) {
			if (other.grantFundingStatus != null)
				return false;
		} else if (!grantFundingStatus.equals(other.grantFundingStatus))
			return false;
		if (grantFundingStatusCd == null) {
			if (other.grantFundingStatusCd != null)
				return false;
		} else if (!grantFundingStatusCd.equals(other.grantFundingStatusCd))
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
		return "GrantFundingStatusEntity [grantFundingStatusCd=" + grantFundingStatusCd + ", grantFundingStatus="
				+ grantFundingStatus + ", invalidInd=" + invalidInd + "]";
	}

	
}
