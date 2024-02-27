package com.microservice.timeLine.client;

import com.microservice.timeLine.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Aqui ponemos el microservicio al que va a asociarse, el puerto
@FeignClient(name= "microservice-user", url = "localhost:8090/app/user")
public interface UserClient {

    //Feign arma la peticion http para la consulta
    //Al no poder recibir entities, tenemos que crear un dto y pasarlo a la lista
    @GetMapping("/search-by-timeline/{idTimeLine}")
    List<UserDTO> findAllUserByTimeLine(@PathVariable Long idTimeLine);
}
