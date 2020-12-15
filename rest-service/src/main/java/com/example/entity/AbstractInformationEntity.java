package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="abstract_info")
public class AbstractInformationEntity implements Serializable {
	
	public AbstractInformationEntity() {
		// TODO Auto-generated constructor stub
	}
		
	public AbstractInformationEntity(Integer abstractId, String abstractFileName, Date dateSelected,
			Date lastModifiedOn, String modifiedUser, String comments, //Integer applicationId,
			ApplicationInformationEntity appEntity) {
		super();
		this.abstractId = abstractId;
		this.abstractFileName = abstractFileName;
		this.dateSelected = dateSelected;
		this.lastModifiedOn = lastModifiedOn;
		this.modifiedUser = modifiedUser;
		this.comments = comments;
		this.appEntity = appEntity;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer abstractId;
	private String abstractFileName;
	private Date dateSelected;
	private Date lastModifiedOn;
	private String modifiedUser;
	private String comments;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "application_id", nullable = false)
    private ApplicationInformationEntity appEntity;

	public void setAbstractId(Integer abstractId) {
		this.abstractId = abstractId;
	}

	public Integer getAbstractId() {
		return abstractId;
	}
	public void setAbstractID(int abstractId) {
		this.abstractId = abstractId;
	}
	public String getAbstractFileName() {
		return abstractFileName;
	}
	public void setAbstractFileName(String abstractFileName) {
		this.abstractFileName = abstractFileName;
	}
	public Date getDateSelected() {
		return dateSelected;
	}
	public void setDateSelected(Date dateSelected) {
		this.dateSelected = dateSelected;
	}
	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}


}
