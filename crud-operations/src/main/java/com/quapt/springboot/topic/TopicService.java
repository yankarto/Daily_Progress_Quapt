package com.quapt.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	

	public List<Topic> getAllTopics() {
		return (List<Topic>) this.topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		return (Topic) this.topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		this.topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		this.topicRepository.delete(id);;
	}
}