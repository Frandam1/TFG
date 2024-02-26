package com.microservice.timeLine.persistence;

import com.microservice.timeLine.entities.TimeLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeLineRepository extends CrudRepository<TimeLine, Long>{
}
