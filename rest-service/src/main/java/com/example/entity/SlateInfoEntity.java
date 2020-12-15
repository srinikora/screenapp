package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slate_info")
public class SlateInfoEntity {

	public SlateInfoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private Integer slateId;
	private Integer fiscalYear;
	private String cfdaSubprogm;
	private Integer scheduleNo;
	private String scheduleTitle;
	private String gsContact;
	private String actionType;
	private Integer performancePeriod;
	private Float plannedAmount;
	private Float revisedAmount;
	private Float recommendedAmount;
	
	public Integer getSlateId() {
		return slateId;
	}
	public void setSlateId(Integer slateId) {
		this.slateId = slateId;
	}
	public Integer getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(Integer fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public String getCfdaSubprogm() {
		return cfdaSubprogm;
	}
	public void setCfdaSubprogm(String cfdaSubprogm) {
		this.cfdaSubprogm = cfdaSubprogm;
	}
	public Integer getScheduleNo() {
		return scheduleNo;
	}
	public void setScheduleNo(Integer scheduleNo) {
		this.scheduleNo = scheduleNo;
	}
	public String getScheduleTitle() {
		return scheduleTitle;
	}
	public void setScheduleTitle(String scheduleTitle) {
		this.scheduleTitle = scheduleTitle;
	}
	public String getGsContact() {
		return gsContact;
	}
	public void setGsContact(String gsContact) {
		this.gsContact = gsContact;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public Integer getPerformancePeriod() {
		return performancePeriod;
	}
	public void setPerformancePeriod(Integer performancePeriod) {
		this.performancePeriod = performancePeriod;
	}
	public Float getPlannedAmount() {
		return plannedAmount;
	}
	public void setPlannedAmount(Float plannedAmount) {
		this.plannedAmount = plannedAmount;
	}
	public Float getRevisedAmount() {
		return revisedAmount;
	}
	public void setRevisedAmount(Float revisedAmount) {
		this.revisedAmount = revisedAmount;
	}
	public Float getRecommendedAmount() {
		return recommendedAmount;
	}
	public void setRecommendedAmount(Float recommendedAmount) {
		this.recommendedAmount = recommendedAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionType == null) ? 0 : actionType.hashCode());
		result = prime * result + ((cfdaSubprogm == null) ? 0 : cfdaSubprogm.hashCode());
		result = prime * result + ((fiscalYear == null) ? 0 : fiscalYear.hashCode());
		result = prime * result + ((gsContact == null) ? 0 : gsContact.hashCode());
		result = prime * result + ((performancePeriod == null) ? 0 : performancePeriod.hashCode());
		result = prime * result + ((plannedAmount == null) ? 0 : plannedAmount.hashCode());
		result = prime * result + ((recommendedAmount == null) ? 0 : recommendedAmount.hashCode());
		result = prime * result + ((revisedAmount == null) ? 0 : revisedAmount.hashCode());
		result = prime * result + ((scheduleNo == null) ? 0 : scheduleNo.hashCode());
		result = prime * result + ((scheduleTitle == null) ? 0 : scheduleTitle.hashCode());
		result = prime * result + ((slateId == null) ? 0 : slateId.hashCode());
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
		SlateInfoEntity other = (SlateInfoEntity) obj;
		if (actionType == null) {
			if (other.actionType != null)
				return false;
		} else if (!actionType.equals(other.actionType))
			return false;
		if (cfdaSubprogm == null) {
			if (other.cfdaSubprogm != null)
				return false;
		} else if (!cfdaSubprogm.equals(other.cfdaSubprogm))
			return false;
		if (fiscalYear == null) {
			if (other.fiscalYear != null)
				return false;
		} else if (!fiscalYear.equals(other.fiscalYear))
			return false;
		if (gsContact == null) {
			if (other.gsContact != null)
				return false;
		} else if (!gsContact.equals(other.gsContact))
			return false;
		if (performancePeriod == null) {
			if (other.performancePeriod != null)
				return false;
		} else if (!performancePeriod.equals(other.performancePeriod))
			return false;
		if (plannedAmount == null) {
			if (other.plannedAmount != null)
				return false;
		} else if (!plannedAmount.equals(other.plannedAmount))
			return false;
		if (recommendedAmount == null) {
			if (other.recommendedAmount != null)
				return false;
		} else if (!recommendedAmount.equals(other.recommendedAmount))
			return false;
		if (revisedAmount == null) {
			if (other.revisedAmount != null)
				return false;
		} else if (!revisedAmount.equals(other.revisedAmount))
			return false;
		if (scheduleNo == null) {
			if (other.scheduleNo != null)
				return false;
		} else if (!scheduleNo.equals(other.scheduleNo))
			return false;
		if (scheduleTitle == null) {
			if (other.scheduleTitle != null)
				return false;
		} else if (!scheduleTitle.equals(other.scheduleTitle))
			return false;
		if (slateId == null) {
			if (other.slateId != null)
				return false;
		} else if (!slateId.equals(other.slateId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SlateInfoEntity [slateId=" + slateId + ", fiscalYear=" + fiscalYear + ", cfdaSubprogm=" + cfdaSubprogm
				+ ", scheduleNo=" + scheduleNo + ", scheduleTitle=" + scheduleTitle + ", gsContact=" + gsContact
				+ ", actionType=" + actionType + ", performancePeriod=" + performancePeriod + ", plannedAmount="
				+ plannedAmount + ", revisedAmount=" + revisedAmount + ", recommendedAmount=" + recommendedAmount + "]";
	}
	
	

}
