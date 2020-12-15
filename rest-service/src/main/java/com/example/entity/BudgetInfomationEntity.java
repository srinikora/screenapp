package com.example.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="budget_info")
public class BudgetInfomationEntity {
	
	public BudgetInfomationEntity() {
		
	}
	
	public BudgetInfomationEntity(Integer budgetPerdId, Integer budgetPerdSeq, Integer budgetPerdFy,
			Date budgetPerdStartDate, Date budgetPerdEndDate, String budgetStatusCd, String budgetPerdCompleteInd,
			String fapiisCertificateInd, Integer participantDecimal, String samCertificateInd, Float personnelReqFedAmt,
			Float personnelRecFedAmt, Float personnelNonFedAmt, Float fringeReqFedAmt, Float fringeRecFedAmt,
			Float fringeNonFedAmt, Float travelReqFedAmt, Float travelRecFedAmt, Float travelNonFedAmt,
			Float equipReqFedAmt, Float equipRecFedAmt, Float equipNonFedAmt, Float supplyReqFedAmt,
			Float supplyRecFedAmt, Float supplyNonFedAmt, Float contractReqFedAmt, Float contractRecFedAmt,
			Float contractNonFedAmt, Float constructReqFedAmt, Float constructRecFedAmt, Float constructNonFedAmt,
			Float otherReqFedAmt, Float otherRecFedAmt, Float otherNonFedAmt, Float trainingReqFedAmt,
			Float trainingRecFedAmt, Float trainingNonFedAmt, Float indirectReqFedAmt, Float indirectRecFedAmt,
			Float indirectNonFedAmt, ApplicationInformationEntity appEntity,
			List<KeyPersonnelInfoEntity> keyPersonnelInfoEntities) {
		super();
		this.budgetPerdId = budgetPerdId;
		this.budgetPerdSeq = budgetPerdSeq;
		this.budgetPerdFy = budgetPerdFy;
		this.budgetPerdStartDate = budgetPerdStartDate;
		this.budgetPerdEndDate = budgetPerdEndDate;
		this.budgetStatusCd = budgetStatusCd;
		this.budgetPerdCompleteInd = budgetPerdCompleteInd;
		this.fapiisCertificateInd = fapiisCertificateInd;
		this.participantDecimal = participantDecimal;
		this.samCertificateInd = samCertificateInd;
		this.personnelReqFedAmt = personnelReqFedAmt;
		this.personnelRecFedAmt = personnelRecFedAmt;
		this.personnelNonFedAmt = personnelNonFedAmt;
		this.fringeReqFedAmt = fringeReqFedAmt;
		this.fringeRecFedAmt = fringeRecFedAmt;
		this.fringeNonFedAmt = fringeNonFedAmt;
		this.travelReqFedAmt = travelReqFedAmt;
		this.travelRecFedAmt = travelRecFedAmt;
		this.travelNonFedAmt = travelNonFedAmt;
		this.equipReqFedAmt = equipReqFedAmt;
		this.equipRecFedAmt = equipRecFedAmt;
		this.equipNonFedAmt = equipNonFedAmt;
		this.supplyReqFedAmt = supplyReqFedAmt;
		this.supplyRecFedAmt = supplyRecFedAmt;
		this.supplyNonFedAmt = supplyNonFedAmt;
		this.contractReqFedAmt = contractReqFedAmt;
		this.contractRecFedAmt = contractRecFedAmt;
		this.contractNonFedAmt = contractNonFedAmt;
		this.constructReqFedAmt = constructReqFedAmt;
		this.constructRecFedAmt = constructRecFedAmt;
		this.constructNonFedAmt = constructNonFedAmt;
		this.otherReqFedAmt = otherReqFedAmt;
		this.otherRecFedAmt = otherRecFedAmt;
		this.otherNonFedAmt = otherNonFedAmt;
		this.trainingReqFedAmt = trainingReqFedAmt;
		this.trainingRecFedAmt = trainingRecFedAmt;
		this.trainingNonFedAmt = trainingNonFedAmt;
		this.indirectReqFedAmt = indirectReqFedAmt;
		this.indirectRecFedAmt = indirectRecFedAmt;
		this.indirectNonFedAmt = indirectNonFedAmt;
		this.appEntity = appEntity;
		this.keyPersonnelInfoEntities = keyPersonnelInfoEntities;
	}




	@Id
	private Integer budgetPerdId;
	@NotNull
	//private Integer applicationId;
	private Integer budgetPerdSeq;
	private Integer budgetPerdFy;
	private Date budgetPerdStartDate;
	private Date budgetPerdEndDate;
	@NotNull
	private String budgetStatusCd;
	private String budgetPerdCompleteInd;
	private String fapiisCertificateInd;
	private Integer participantDecimal;
	private String samCertificateInd;
	private Float personnelReqFedAmt;
	private Float personnelRecFedAmt;
	private Float personnelNonFedAmt;
	private Float fringeReqFedAmt;
	private Float fringeRecFedAmt;
	private Float fringeNonFedAmt;
	private Float travelReqFedAmt;
	private Float travelRecFedAmt;
	private Float travelNonFedAmt;
	private Float equipReqFedAmt;
	private Float equipRecFedAmt;
	private Float equipNonFedAmt;
	private Float supplyReqFedAmt;
	private Float supplyRecFedAmt;
	private Float supplyNonFedAmt;
	private Float contractReqFedAmt;
	private Float contractRecFedAmt;
	private Float contractNonFedAmt;
	private Float constructReqFedAmt;
	private Float constructRecFedAmt;
	private Float constructNonFedAmt;
	private Float otherReqFedAmt;
	private Float otherRecFedAmt;
	private Float otherNonFedAmt;
	private Float trainingReqFedAmt;
	private Float trainingRecFedAmt;
	private Float trainingNonFedAmt;
	private Float indirectReqFedAmt;
	private Float indirectRecFedAmt;
	private Float indirectNonFedAmt;
	
    @ManyToOne(optional = false)
    @JoinColumn(name = "application_id", nullable = false)
    private ApplicationInformationEntity appEntity;
	
	@OneToMany(mappedBy = "budgetEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<KeyPersonnelInfoEntity> keyPersonnelInfoEntities;
	
	public List<KeyPersonnelInfoEntity> getKeyPersonnelInfoEntities() {
		return keyPersonnelInfoEntities;
	}

	public void setKeyPersonnelInfoEntities(List<KeyPersonnelInfoEntity> keyPersonnelInfoEntities) {
		this.keyPersonnelInfoEntities = keyPersonnelInfoEntities;
	}
    
	public Integer getBudgetPerdId() {
		return budgetPerdId;
	}
	public void setBudgetPerdId(Integer budgetPerdId) {
		this.budgetPerdId = budgetPerdId;
	}

	public Integer getBudgetPerdSeq() {
		return budgetPerdSeq;
	}
	public void setBudgetPerdSeq(Integer budgetPerdSeq) {
		this.budgetPerdSeq = budgetPerdSeq;
	}
	public Integer getBudgetPerdFy() {
		return budgetPerdFy;
	}
	public void setBudgetPerdFy(Integer budgetPerdFy) {
		this.budgetPerdFy = budgetPerdFy;
	}
	public Date getBudgetPerdStartDate() {
		return budgetPerdStartDate;
	}
	public void setBudgetPerdStartDate(Date budgetPerdStartDate) {
		this.budgetPerdStartDate = budgetPerdStartDate;
	}
	public Date getBudgetPerdEndDate() {
		return budgetPerdEndDate;
	}
	public void setBudgetPerdEndDate(Date budgetPerdEndDate) {
		this.budgetPerdEndDate = budgetPerdEndDate;
	}
	public String getBudgetStatusCd() {
		return budgetStatusCd;
	}
	public void setBudgetStatusCd(String budgetStatusCd) {
		this.budgetStatusCd = budgetStatusCd;
	}
	public String getBudgetPerdCompleteInd() {
		return budgetPerdCompleteInd;
	}
	public void setBudgetPerdCompleteInd(String budgetPerdCompleteInd) {
		this.budgetPerdCompleteInd = budgetPerdCompleteInd;
	}
	public String getFapiisCertificateInd() {
		return fapiisCertificateInd;
	}
	public void setFapiisCertificateInd(String fapiisCertificateInd) {
		this.fapiisCertificateInd = fapiisCertificateInd;
	}
	public Integer getParticipantDecimal() {
		return participantDecimal;
	}
	public void setParticipantDecimal(Integer participantDecimal) {
		this.participantDecimal = participantDecimal;
	}
	public String getSamCertificateInd() {
		return samCertificateInd;
	}
	public void setSamCertificateInd(String samCertificateInd) {
		this.samCertificateInd = samCertificateInd;
	}
	public Float getPersonnelReqFedAmt() {
		return personnelReqFedAmt;
	}
	public void setPersonnelReqFedAmt(Float personnelReqFedAmt) {
		this.personnelReqFedAmt = personnelReqFedAmt;
	}
	public Float getPersonnelNonFedAmt() {
		return personnelNonFedAmt;
	}
	public void setPersonnelNonFedAmt(Float personnelNonFedAmt) {
		this.personnelNonFedAmt = personnelNonFedAmt;
	}
	public Float getFringeReqFedAmt() {
		return fringeReqFedAmt;
	}
	public void setFringeReqFedAmt(Float fringeReqFedAmt) {
		this.fringeReqFedAmt = fringeReqFedAmt;
	}
	public Float getFringeRecFedAmt() {
		return fringeRecFedAmt;
	}
	public void setFringeRecFedAmt(Float fringeRecFedAmt) {
		this.fringeRecFedAmt = fringeRecFedAmt;
	}
	public Float getFringeNonFedAmt() {
		return fringeNonFedAmt;
	}
	public void setFringeNonFedAmt(Float fringeNonFedAmt) {
		this.fringeNonFedAmt = fringeNonFedAmt;
	}
	public Float getTravelReqFedAmt() {
		return travelReqFedAmt;
	}
	public void setTravelReqFedAmt(Float travelReqFedAmt) {
		this.travelReqFedAmt = travelReqFedAmt;
	}
	public Float getTravelRecFedAmt() {
		return travelRecFedAmt;
	}
	public void setTravelRecFedAmt(Float travelRecFedAmt) {
		this.travelRecFedAmt = travelRecFedAmt;
	}
	public Float getTravelNonFedAmt() {
		return travelNonFedAmt;
	}
	public void setTravelNonFedAmt(Float travelNonFedAmt) {
		this.travelNonFedAmt = travelNonFedAmt;
	}
	public Float getEquipReqFedAmt() {
		return equipReqFedAmt;
	}
	public void setEquipReqFedAmt(Float equipReqFedAmt) {
		this.equipReqFedAmt = equipReqFedAmt;
	}
	public Float getEquipRecFedAmt() {
		return equipRecFedAmt;
	}
	public void setEquipRecFedAmt(Float equipRecFedAmt) {
		this.equipRecFedAmt = equipRecFedAmt;
	}
	public Float getEquipNonFedAmt() {
		return equipNonFedAmt;
	}
	public void setEquipNonFedAmt(Float equipNonFedAmt) {
		this.equipNonFedAmt = equipNonFedAmt;
	}
	public Float getSupplyReqFedAmt() {
		return supplyReqFedAmt;
	}
	public void setSupplyReqFedAmt(Float supplyReqFedAmt) {
		this.supplyReqFedAmt = supplyReqFedAmt;
	}
	public Float getSupplyRecFedAmt() {
		return supplyRecFedAmt;
	}
	public void setSupplyRecFedAmt(Float supplyRecFedAmt) {
		this.supplyRecFedAmt = supplyRecFedAmt;
	}
	public Float getSupplyNonFedAmt() {
		return supplyNonFedAmt;
	}
	public void setSupplyNonFedAmt(Float supplyNonFedAmt) {
		this.supplyNonFedAmt = supplyNonFedAmt;
	}
	public Float getContractReqFedAmt() {
		return contractReqFedAmt;
	}
	public void setContractReqFedAmt(Float contractReqFedAmt) {
		this.contractReqFedAmt = contractReqFedAmt;
	}
	public Float getContractRecFedAmt() {
		return contractRecFedAmt;
	}
	public void setContractRecFedAmt(Float contractRecFedAmt) {
		this.contractRecFedAmt = contractRecFedAmt;
	}
	public Float getContractNonFedAmt() {
		return contractNonFedAmt;
	}
	public void setContractNonFedAmt(Float contractNonFedAmt) {
		this.contractNonFedAmt = contractNonFedAmt;
	}
	public Float getConstructReqFedAmt() {
		return constructReqFedAmt;
	}
	public void setConstructReqFedAmt(Float constructReqFedAmt) {
		this.constructReqFedAmt = constructReqFedAmt;
	}
	public Float getConstructRecFedAmt() {
		return constructRecFedAmt;
	}
	public void setConstructRecFedAmt(Float constructRecFedAmt) {
		this.constructRecFedAmt = constructRecFedAmt;
	}
	public Float getConstructNonFedAmt() {
		return constructNonFedAmt;
	}
	public void setConstructNonFedAmt(Float constructNonFedAmt) {
		this.constructNonFedAmt = constructNonFedAmt;
	}
	public Float getOtherReqFedAmt() {
		return otherReqFedAmt;
	}
	public void setOtherReqFedAmt(Float otherReqFedAmt) {
		this.otherReqFedAmt = otherReqFedAmt;
	}
	public Float getOtherRecFedAmt() {
		return otherRecFedAmt;
	}
	public void setOtherRecFedAmt(Float otherRecFedAmt) {
		this.otherRecFedAmt = otherRecFedAmt;
	}
	public Float getOtherNonFedAmt() {
		return otherNonFedAmt;
	}
	public void setOtherNonFedAmt(Float otherNonFedAmt) {
		this.otherNonFedAmt = otherNonFedAmt;
	}
	public Float getTrainingReqFedAmt() {
		return trainingReqFedAmt;
	}
	public void setTrainingReqFedAmt(Float trainingReqFedAmt) {
		this.trainingReqFedAmt = trainingReqFedAmt;
	}
	public Float getTrainingRecFedAmt() {
		return trainingRecFedAmt;
	}
	public void setTrainingRecFedAmt(Float trainingRecFedAmt) {
		this.trainingRecFedAmt = trainingRecFedAmt;
	}
	public Float getTrainingNonFedAmt() {
		return trainingNonFedAmt;
	}
	public void setTrainingNonFedAmt(Float trainingNonFedAmt) {
		this.trainingNonFedAmt = trainingNonFedAmt;
	}
	public Float getIndirectReqFedAmt() {
		return indirectReqFedAmt;
	}
	public void setIndirectReqFedAmt(Float indirectReqFedAmt) {
		this.indirectReqFedAmt = indirectReqFedAmt;
	}
	public Float getIndirectRecFedAmt() {
		return indirectRecFedAmt;
	}
	public void setIndirectRecFedAmt(Float indirectRecFedAmt) {
		this.indirectRecFedAmt = indirectRecFedAmt;
	}
	public Float getIndirectNonFedAmt() {
		return indirectNonFedAmt;
	}
	public void setIndirectNonFedAmt(Float indirectNonFedAmt) {
		this.indirectNonFedAmt = indirectNonFedAmt;
	}

	public Float getPersonnelRecFedAmt() {
		return personnelRecFedAmt;
	}

	public void setPersonnelRecFedAmt(Float personnelRecFedAmt) {
		this.personnelRecFedAmt = personnelRecFedAmt;
	}
	


	
	
}
