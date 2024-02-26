package com.microservice.timeLine.service;

import com.microservice.timeLine.entities.TimeLine;
import java.util.List;


public interface InterfaceTimeLineService {

    List<TimeLine> findAll();

    TimeLine findById(Long id);

    void save(TimeLine timeLine);
}
