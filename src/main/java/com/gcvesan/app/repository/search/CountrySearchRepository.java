package com.gcvesan.app.repository.search;

import com.gcvesan.app.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Country} entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}
