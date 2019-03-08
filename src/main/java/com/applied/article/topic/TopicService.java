package com.applied.article.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
		new Topic("java","Java Spring", "Topic Description 1"),
		new Topic("oop","Object Oriented Programming", "Topic Description 2"),
		new Topic("node","Node Js", "Topic Description 3")
	));
	
	public Topic getTopic(String id) {
		Topic topic = null;
		for(Topic t: topics) {
			if(t.getId().equals(id)) {
				topic = t;
				break;
			}
		}
		return topic;
	}

	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
					
		}
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
					
		}
	}
}
