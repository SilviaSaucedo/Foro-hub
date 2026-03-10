package com.forohub.foro_api.service;
import com.forohub.foro_api.model.Topic;
import com.forohub.foro_api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TopicService {

    @Autowired
    private TopicRepository repository;

    public List<Topic> getAllTopics() {
        return repository.findAll();
    }

    public Optional<Topic> getTopicById(Long id) {
        return repository.findById(id);
    }

    public Topic createTopic(Topic topic) {
        return repository.save(topic);
    }

    public Topic updateTopic(Long id, Topic updatedTopic) {
        return repository.findById(id).map(topic -> {
            topic.setTitle(updatedTopic.getTitle());
            topic.setDescription(updatedTopic.getDescription());
            return repository.save(topic);
        }).orElseThrow(() -> new RuntimeException("Tópico no encontrado"));
    }

    public void deleteTopic(Long id) {
        repository.deleteById(id);
    }
}
