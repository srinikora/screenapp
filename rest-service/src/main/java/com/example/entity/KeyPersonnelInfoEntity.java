package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="key_personnel_info")
public class KeyPersonnelInfoEntity {

	public KeyPersonnelInfoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private Integer keyPersonnelId;
	//private Integer budgetPerdId;
	@NotNull
	private String keyPersonnelTitleCd;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private Float levelOfEffort;
	private String phoneNumber;
	private String email;
	
    @ManyToOne(optional = false)
    @JoinColumn(name = "budget_perd_id", nullable = false)
    private BudgetInfomationEntity budgetEntity;
	
	public Integer getKeyPersonnelId() {
		return keyPersonnelId;
	}
	public void setKeyPersonnelId(Integer keyPersonnelId) {
		this.keyPersonnelId = keyPersonnelId;
	}

	/*
	 * public Integer getBudgetPerdId() { return budgetPerdId; } public void
	 * setBudgetPerdId(Integer budgetPerdId) { this.budgetPerdId = budgetPerdId; }
	 */
	public String getKeyPersonnelTitleCd() {
		return keyPersonnelTitleCd;
	}
	public void setKeyPersonnelTitleCd(String keyPersonnelTitleCd) {
		this.keyPersonnelTitleCd = keyPersonnelTitleCd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public Float getLevelOfEffort() {
		return levelOfEffort;
	}
	public void setLevelOfEffort(Float levelOfEffort) {
		this.levelOfEffort = levelOfEffort;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
