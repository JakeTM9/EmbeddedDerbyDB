package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;


// explained in Spring Boot Quick Start 29&30
public interface TopicRepository extends CrudRepository<Topic, String>{
	
	
	
	// getALLTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	
	
	

}
