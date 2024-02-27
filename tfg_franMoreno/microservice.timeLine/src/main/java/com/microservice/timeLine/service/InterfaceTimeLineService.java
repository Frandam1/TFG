package com.microservice.timeLine.service;

import com.microservice.timeLine.entities.TimeLine;
import com.microservice.timeLine.http.response.UserByTimeLineResponse;

import java.util.List;


public interface InterfaceTimeLineService {

    List<TimeLine> findAll();

    TimeLine findById(Long id);

    void save(TimeLine timeLine);

    UserByTimeLineResponse findUsersByIdTimeLine(Long idTimeLine);
}
