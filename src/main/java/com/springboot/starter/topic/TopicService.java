package com.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Spring Business Service

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("Topic 1", "DSCode", "CS Fundamentals"),
			new Topic("Topic 2", "DSA", "CS Fundamentals"),
			new Topic("Topic 3", "ML", "AI")));
	

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String topicId) {
		for(Topic t : topics) {
			if(t.getId().equals(topicId)) {
				return t;
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
