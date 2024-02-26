package com.microservice.timeLine.service;

import com.microservice.timeLine.entities.TimeLine;
import com.microservice.timeLine.persistence.TimeLineRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TimeLineImpl implements InterfaceTimeLineService{

    @Autowired
    private TimeLineRepository timeLineRepository;

    @Override
    public List<TimeLine> findAll() {
        return (List<TimeLine>) timeLineRepository.findAll();
    }

    @Override
    public TimeLine findById(Long id) {

        return timeLineRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(TimeLine timeLine) {
        timeLineRepository.save(timeLine);
    }
}
