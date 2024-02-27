package com.microservice.timeLine.service;

import com.microservice.timeLine.client.UserClient;
import com.microservice.timeLine.dto.UserDTO;
import com.microservice.timeLine.entities.TimeLine;
import com.microservice.timeLine.http.response.UserByTimeLineResponse;
import com.microservice.timeLine.persistence.TimeLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeLineImpl implements InterfaceTimeLineService{

    @Autowired
    private TimeLineRepository timeLineRepository;

    //Inyectamos el servicio que tiene el feign
    @Autowired
    private UserClient userClient;

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

    @Override
    public UserByTimeLineResponse findUsersByIdTimeLine(Long idTimeLine) {

        //Consultamos la timeline, al devolver un optional, tenemos que gestionar esa opción.
        TimeLine timeLine = timeLineRepository.findById(idTimeLine).orElse(new TimeLine());

        //Obtenemos los usuarios, con esto el mcsv timeline se va a conectar con el mcsv user

        List<UserDTO> userDTOList = userClient.findAllUserByTimeLine(idTimeLine);

        //Ahora retornamos el objeto UserByTimeLineResponse, pero con builder
        // El objeto timeLine tiene los atributos que necesitamos, en este caso solo el nombre, y la
        // lista la tiene el userDTOList.
        return UserByTimeLineResponse.builder()
                .timeLineName(timeLine.getName())
                .userDTOList(userDTOList)
                .build();
    }
}
