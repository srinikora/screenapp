package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="application_info")
public class ApplicationInformationEntity implements Serializable {
	
	public ApplicationInformationEntity() {
		// TODO Auto-generated constructor stub
	}
		
	public ApplicationInformationEntity(Integer applicationId, Integer slateId, String applicantName, String prAwardNo,
			Float requestedAmount, Float recommendedAmount, Float totalAllocatedAmount, String grantFundingStatusCd,
			String edProgramContact, String edProgramContactPhone, String edProgramContactEmail, String stateCd,
			Integer rankNo, String highRiskCd, String granteeDuns, String applicationCompleteInd,
			String abstractCompleteInd, String msMonitoringReqInd, String msTechnicalAssistanceInd,
			String accsDataString, String applicationStatus, String narrativeReceivedInd, String applicationComment,
			String lateInd, String duplicateInd, String duplicateAward, String eligibleStatusCd, String ineligibleCatCd,
			String eligibilityStatusCmt, List<AbstractInformationEntity> abstractEntities,
			List<BudgetInfomationEntity> budgetEntities) {
		super();
		this.applicationId = applicationId;
		this.slateId = slateId;
		this.applicantName = applicantName;
		this.prAwardNo = prAwardNo;
		this.requestedAmount = requestedAmount;
		this.recommendedAmount = recommendedAmount;
		this.totalAllocatedAmount = totalAllocatedAmount;
		this.grantFundingStatusCd = grantFundingStatusCd;
		this.edProgramContact = edProgramContact;
		this.edProgramContactPhone = edProgramContactPhone;
		this.edProgramContactEmail = edProgramContactEmail;
		this.stateCd = stateCd;
		this.rankNo = rankNo;
		this.highRiskCd = highRiskCd;
		this.granteeDuns = granteeDuns;
		this.applicationCompleteInd = applicationCompleteInd;
		this.abstractCompleteInd = abstractCompleteInd;
		this.msMonitoringReqInd = msMonitoringReqInd;
		this.msTechnicalAssistanceInd = msTechnicalAssistanceInd;
		this.accsDataString = accsDataString;
		this.applicationStatus = applicationStatus;
		this.narrativeReceivedInd = narrativeReceivedInd;
		this.applicationComment = applicationComment;
		this.lateInd = lateInd;
		this.duplicateInd = duplicateInd;
		this.duplicateAward = duplicateAward;
		this.eligibleStatusCd = eligibleStatusCd;
		this.ineligibleCatCd = ineligibleCatCd;
		this.eligibilityStatusCmt = eligibilityStatusCmt;
		this.abstractEntities = abstractEntities;
		this.budgetEntities = budgetEntities;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicationId;
	private Integer slateId;
	private String applicantName;
	private String prAwardNo;
	private Float requestedAmount;
	private Float recommendedAmount;
	private Float totalAllocatedAmount;
	private String grantFundingStatusCd;
	private String edProgramContact;
	private String edProgramContactPhone;
	private String edProgramContactEmail;
	private String stateCd;
	private Integer rankNo;
	private String highRiskCd;
	private String granteeDuns;
	private String applicationCompleteInd;
	private String abstractCompleteInd;
	private String msMonitoringReqInd;
	private String msTechnicalAssistanceInd;
	private String accsDataString;
	private String applicationStatus;
	private String narrativeReceivedInd;
	private String applicationComment;
	private String lateInd;
	private String duplicateInd;
	private String duplicateAward;
	private String eligibleStatusCd;
	private String ineligibleCatCd;
	private String eligibilityStatusCmt;
	
	@OneToMany(mappedBy = "appEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AbstractInformationEntity> abstractEntities;
	
	@OneToMany(mappedBy = "appEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BudgetInfomationEntity> budgetEntities;
		
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public Integer getSlateId() {
		return slateId;
	}
	public void setSlateId(Integer slateId) {
		this.slateId = slateId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getPrAwardNo() {
		return prAwardNo;
	}
	public void setPrAwardNo(String prAwardNo) {
		this.prAwardNo = prAwardNo;
	}
	public Float getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(float requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	public Float getRecommendedAmount() {
		return recommendedAmount;
	}
	public void setRecommendedAmount(float recommendedAmount) {
		this.recommendedAmount = recommendedAmount;
	}
	public Float getTotalAllocatedAmount() {
		return totalAllocatedAmount;
	}
	public void setTotalAllocatedAmount(float totalAllocatedAmount) {
		this.totalAllocatedAmount = totalAllocatedAmount;
	}
	public String getGrantFundingStatusCd() {
		return grantFundingStatusCd;
	}
	public void setGrantFundingStatusCd(String grantFundingStatusCd) {
		this.grantFundingStatusCd = grantFundingStatusCd;
	}
	public String getEdProgramContact() {
		return edProgramContact;
	}
	public void setEdProgramContact(String edProgramContact) {
		this.edProgramContact = edProgramContact;
	}
	public String getEdProgramContactPhone() {
		return edProgramContactPhone;
	}
	public void setEdProgramContactPhone(String edProgramContactPhone) {
		this.edProgramContactPhone = edProgramContactPhone;
	}
	public String getEdProgramContactEmail() {
		return edProgramContactEmail;
	}
	public void setEdProgramContactEmail(String edProgramContactEmail) {
		this.edProgramContactEmail = edProgramContactEmail;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public Integer getRankNo() {
		return rankNo;
	}
	public void setRankNo(Integer rankNo) {
		this.rankNo = rankNo;
	}
	public String getHighRiskCd() {
		return highRiskCd;
	}
	public void setHighRiskCd(String highRiskCd) {
		this.highRiskCd = highRiskCd;
	}
	public String getGranteeDuns() {
		return granteeDuns;
	}
	public void setGranteeDuns(String granteeDuns) {
		this.granteeDuns = granteeDuns;
	}
	public String getApplicationCompleteInd() {
		return applicationCompleteInd;
	}
	public void setApplicationCompleteInd(String applicationCompleteInd) {
		this.applicationCompleteInd = applicationCompleteInd;
	}
	public String getAbstractCompleteInd() {
		return abstractCompleteInd;
	}
	public void setAbstractCompleteInd(String abstractCompleteInd) {
		this.abstractCompleteInd = abstractCompleteInd;
	}
	public String getMsMonitoringReqInd() {
		return msMonitoringReqInd;
	}
	public void setMsMonitoringReqInd(String msMonitoringReqInd) {
		this.msMonitoringReqInd = msMonitoringReqInd;
	}
	public String getMsTechnicalAssistanceInd() {
		return msTechnicalAssistanceInd;
	}
	public void setMsTechnicalAssistanceInd(String msTechnicalAssistanceInd) {
		this.msTechnicalAssistanceInd = msTechnicalAssistanceInd;
	}
	public String getAccsDataString() {
		return accsDataString;
	}
	public void setAccsDataString(String accsDataString) {
		this.accsDataString = accsDataString;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getNarrativeReceivedInd() {
		return narrativeReceivedInd;
	}
	public void setNarrativeReceivedInd(String narrativeReceivedInd) {
		this.narrativeReceivedInd = narrativeReceivedInd;
	}
	public String getApplicationComment() {
		return applicationComment;
	}
	public void setApplicationComment(String applicationComment) {
		this.applicationComment = applicationComment;
	}
	public String getLateInd() {
		return lateInd;
	}
	public void setLateInd(String lateInd) {
		this.lateInd = lateInd;
	}
	public String getDuplicateInd() {
		return duplicateInd;
	}
	public void setDuplicateInd(String duplicateInd) {
		this.duplicateInd = duplicateInd;
	}
	public String getDuplicateAward() {
		return duplicateAward;
	}
	public void setDuplicateAward(String duplicateAward) {
		this.duplicateAward = duplicateAward;
	}
	public String getEligibleStatusCd() {
		return eligibleStatusCd;
	}
	public void setEligibleStatusCd(String eligibleStatusCd) {
		this.eligibleStatusCd = eligibleStatusCd;
	}
	public String getIneligibleCatCd() {
		return ineligibleCatCd;
	}
	public void setIneligibleCatCd(String ineligibleCatCd) {
		this.ineligibleCatCd = ineligibleCatCd;
	}
	public String getEligibilityStatusCmt() {
		return eligibilityStatusCmt;
	}
	public void setEligibilityStatusCmt(String eligibilityStatusCmt) {
		this.eligibilityStatusCmt = eligibilityStatusCmt;
	}
	public List<AbstractInformationEntity> getAbstractEntities() {
		return abstractEntities;
	}

	public void setAbstractEntities(List<AbstractInformationEntity> abstractEntities) {
		this.abstractEntities = abstractEntities;
	}

	public void setRequestedAmount(Float requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public void setRecommendedAmount(Float recommendedAmount) {
		this.recommendedAmount = recommendedAmount;
	}

	public void setTotalAllocatedAmount(Float totalAllocatedAmount) {
		this.totalAllocatedAmount = totalAllocatedAmount;
	}

	public List<BudgetInfomationEntity> getBudgetEntities() {
		return budgetEntities;
	}

	public void setBudgetEntities(List<BudgetInfomationEntity> budgetEntities) {
		this.budgetEntities = budgetEntities;
	}
	
	
}