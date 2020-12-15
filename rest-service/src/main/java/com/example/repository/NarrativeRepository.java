package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.NarrativeDocumentEntity;

public interface NarrativeRepository extends CrudRepository<NarrativeDocumentEntity, Integer> {
	
	@Query(value="select * from narrative_document u where u.application_id=?1" , nativeQuery=true)
	List<NarrativeDocumentEntity> getNarrativesByAppId(int id);

}
