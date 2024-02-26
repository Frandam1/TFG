package com.microservice.User.Service;

/*Esto sigue el patrón de diseño de repositorio en Spring,
donde los repositorios proporcionan métodos para realizar operaciones CRUD
(Crear, Leer, Actualizar, Eliminar) en la base de datos,y los servicios
utilizan estos métodos para realizar operaciones más específicas o de negocio en la aplicación.*/

import com.microservice.User.entities.User;
import com.microservice.User.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // IMPORTANTE EL DECORADOR
public class UserServiceImpl implements InterfaceUserService{

    ////////////////////// INYECCION METODOS REPOSITORIO ///////////////////////////////////
    @Autowired
    private UserRepository userRepository;

    ////////////////////// IMPLEMENTACION METODOS SERVICIO (CRUD) ///////////////////////////////////
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
    //Esto devuelve un optional por lo que es necesario el Else en caso de que falle
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    ////////////////////// IMPLEMENTACION METODOS SERVICIO (PERSONALIZADOS) ///////////////////////////////////
    @Override
    public List<User> findByIdTimeLine(Long idTimeLine) {
        return userRepository.findAllByTimeLineId(idTimeLine);
    }
}
