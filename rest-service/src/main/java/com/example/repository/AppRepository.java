package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.ApplicationInformationEntity;

public interface AppRepository extends CrudRepository<ApplicationInformationEntity, Integer> {
	
	@Query(value="select * from application_info u where u.SLATE_ID=?1" , nativeQuery=true)
	List<ApplicationInformationEntity> getAppsBySlateId(int slateId);

}
