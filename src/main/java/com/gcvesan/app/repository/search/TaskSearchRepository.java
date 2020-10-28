package com.gcvesan.app.repository.search;

import com.gcvesan.app.domain.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Task} entity.
 */
public interface TaskSearchRepository extends ElasticsearchRepository<Task, Long> {
}
