package com.microservice.timeLine.http.response;
// Esta clase va a mapear la respuesta al usuario que consulta nuestro mcsv

import com.microservice.timeLine.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserByTimeLineResponse {

    //Cuando se solicite, yo le voy a responder con el nombre de la TL y una lista de usuarios de la misma
    private String timeLineName;
    private List<UserDTO> userDTOList;
}
