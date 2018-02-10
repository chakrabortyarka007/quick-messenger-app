package com.org.messenger.graphrepository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.org.messenger.entity.People;

public interface SignUpRepository extends GraphRepository<People> {
	
	

}
