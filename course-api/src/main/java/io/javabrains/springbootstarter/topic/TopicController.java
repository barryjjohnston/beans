package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring framwork", "Spring Framwork Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "Javascript", "Javascript Description"));
	}

}
