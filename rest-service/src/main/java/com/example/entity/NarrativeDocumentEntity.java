package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="narrative_document")
public class NarrativeDocumentEntity {

	public NarrativeDocumentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private Integer narrativeDocumentId;
	@NotNull
	private String source;
	@NotNull
	private String title;
	@NotNull
	private String documentLink;
	private Integer applicationId;
	
	public Integer getNarrativeDocumentId() {
		return narrativeDocumentId;
	}
	public void setNarrativeDocumentId(Integer narrativeDocumentId) {
		this.narrativeDocumentId = narrativeDocumentId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDocumentLink() {
		return documentLink;
	}
	public void setDocumentLink(String documentLink) {
		this.documentLink = documentLink;
	}
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
		result = prime * result + ((documentLink == null) ? 0 : documentLink.hashCode());
		result = prime * result + ((narrativeDocumentId == null) ? 0 : narrativeDocumentId.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		NarrativeDocumentEntity other = (NarrativeDocumentEntity) obj;
		if (applicationId == null) {
			if (other.applicationId != null)
				return false;
		} else if (!applicationId.equals(other.applicationId))
			return false;
		if (documentLink == null) {
			if (other.documentLink != null)
				return false;
		} else if (!documentLink.equals(other.documentLink))
			return false;
		if (narrativeDocumentId == null) {
			if (other.narrativeDocumentId != null)
				return false;
		} else if (!narrativeDocumentId.equals(other.narrativeDocumentId))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NarrativeDocumentEntity [narrativeDocumentId=" + narrativeDocumentId + ", source=" + source + ", title="
				+ title + ", documentLink=" + documentLink + ", applicationId=" + applicationId + "]";
	}
	
	
	
}
