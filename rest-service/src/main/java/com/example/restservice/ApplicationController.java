package com.example.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ApplicationInformationEntity;
import com.example.entity.NarrativeDocumentEntity;
import com.example.service.ApplicationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("demo")
public class ApplicationController {

	@Autowired
	protected ApplicationService appService;

	/**
	 * Return all the applications
	 * @return
	 */
	@ApiOperation(value = "Get all applications")
	@GetMapping("/return-applications")
	public @ResponseBody Iterable<ApplicationInformationEntity> returnApplications() {
		
		return appService.getAllApplications();
	}
	

	/**
	 * Update an application.
	 * @param id
	 * @param appData
	 * @return
	 */
	@ApiOperation(value = "Update an application based on an application-id")
	@PutMapping("/process-application/{applicationId}")
	public @ResponseBody ApplicationInformationEntity updateApplication(@PathVariable(value="applicationId") int id,
			@RequestBody ApplicationInformationEntity appData) {
		
		ApplicationInformationEntity updatedApp = appService.updateApplicationData(id, appData);
		return updatedApp;		
	}
	
	
	/**
	 * Return a single application based on application-id.
	 * @return
	 */
	@ApiOperation(value = "Get a single application based on application-id")
	@GetMapping("/return-application/{applicationId}")
	public @ResponseBody ApplicationInformationEntity returnSingleApplication(@PathVariable(value="applicationId") int id) {
		
		return appService.getSingleApplication(id);
	}
	
	/**
	 * Return all applications based on slate-id.
	 * @return
	 */
	@ApiOperation(value = "Get all applications based on slate-id")
	@GetMapping("/return-applications/{slateId}")
	public @ResponseBody List<ApplicationInformationEntity> returnApplicationsForSlate(@PathVariable(value="slateId") int id) {
		
		return appService.getApplicationsForSlate(id);
	}
	
	/**
	 * 
	 */
	@ApiOperation(value = "Get all narratives")
	@GetMapping("/return-all-narratives")
	public @ResponseBody Iterable<NarrativeDocumentEntity> returnAllNarratives(){
		return appService.getNarratives();
		
	}
}
