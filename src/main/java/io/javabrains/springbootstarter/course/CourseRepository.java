package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


// explained in Spring Boot Quick Start 29&30
public interface CourseRepository extends CrudRepository<Course, String>{
	
	
	public List<Course> findByName(String name);//Don't have to implement- Declare method with the findByProperty name format,
													//and Spring Data JPA will implement the method for me.
	
	public List<Course> findByDescription(String description);
	
	public List<Course> findByTopicId(String topicId);
	
	
	// getALLTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	
	
	

}
