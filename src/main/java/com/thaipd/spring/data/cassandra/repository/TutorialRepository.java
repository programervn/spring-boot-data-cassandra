package com.thaipd.spring.data.cassandra.repository;

import java.util.List;
import java.util.UUID;

import com.thaipd.spring.data.cassandra.model.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {
  @AllowFiltering
  List<Tutorial> findByPublished(boolean published);
  
  List<Tutorial> findByTitleContaining(String title);
}
