package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ApplicationInformationEntity;
import com.example.entity.NarrativeDocumentEntity;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.AppRepository;
import com.example.repository.NarrativeRepository;

@Service
public class ApplicationService {
	
	@Autowired
	private AppRepository appRepository;
	
	@Autowired
	private NarrativeRepository narrativeRepository;
	

	/**
	 * Service to return all applications
	 * @return
	 */
	public Iterable<ApplicationInformationEntity> getAllApplications(){		
		return appRepository.findAll();
	}
	
	/**
	 * Service to return all applications for the slate-id
	 * @return
	 */
	public List<ApplicationInformationEntity> getApplicationsForSlate(int id){		
		return appRepository.getAppsBySlateId(id);
	}
	
	/**
	 * Service to return an application.
	 * @return
	 */
	public ApplicationInformationEntity getSingleApplication(int id){		
		return appRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException(id));
	}
	
	/**
	 * Update the selected application
	 */
	public ApplicationInformationEntity updateApplicationData(int id, ApplicationInformationEntity appData) {
		
		ApplicationInformationEntity updatedApp = appRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException(id));
		
		updatedApp.setApplicantName(appData.getApplicantName());
		updatedApp.setSlateId(appData.getSlateId());
		updatedApp.setPrAwardNo(appData.getPrAwardNo());
		updatedApp.setRequestedAmount(appData.getRequestedAmount());
		updatedApp.setRecommendedAmount(appData.getRecommendedAmount());
		updatedApp.setTotalAllocatedAmount(appData.getTotalAllocatedAmount());
		updatedApp.setAbstractCompleteInd(appData.getAbstractCompleteInd());
		updatedApp.setAccsDataString(appData.getAccsDataString());
		updatedApp.setGranteeDuns(appData.getGranteeDuns());
		updatedApp.setGrantFundingStatusCd(appData.getGrantFundingStatusCd());
		updatedApp.setEdProgramContact(appData.getEdProgramContact());
		updatedApp.setEdProgramContactEmail(appData.getEdProgramContactEmail());
		updatedApp.setEdProgramContactPhone(appData.getEdProgramContactPhone());
		updatedApp.setStateCd(appData.getStateCd());
		updatedApp.setRankNo(appData.getRankNo());
		updatedApp.setHighRiskCd(appData.getHighRiskCd());
		updatedApp.setApplicationCompleteInd(appData.getApplicationCompleteInd());
		updatedApp.setMsMonitoringReqInd(appData.getMsMonitoringReqInd());
		updatedApp.setMsTechnicalAssistanceInd(appData.getMsTechnicalAssistanceInd());
		updatedApp.setApplicationStatus(appData.getApplicationStatus());
		updatedApp.setNarrativeReceivedInd(appData.getNarrativeReceivedInd());
		updatedApp.setApplicationComment(appData.getApplicationComment());
		updatedApp.setLateInd(appData.getLateInd());
		updatedApp.setDuplicateAward(appData.getDuplicateAward());
		updatedApp.setDuplicateInd(appData.getDuplicateInd());
		updatedApp.setEligibilityStatusCmt(appData.getEligibilityStatusCmt());
		updatedApp.setEligibleStatusCd(appData.getEligibleStatusCd());
		updatedApp.setIneligibleCatCd(appData.getIneligibleCatCd());
		
		appRepository.save(updatedApp);
		
		return updatedApp;
	}

	/**
	 * Service call to get all narratives.
	 * @param id
	 * @return
	 */
	public Iterable<NarrativeDocumentEntity> getNarratives() {
		// TODO Auto-generated method stub
		return narrativeRepository.findAll();
	}
	
}
