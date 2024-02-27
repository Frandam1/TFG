package com.microservice.timeLine.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    // En esencia, es una representacion de nuestra entidad user en nuestro mcsv timeline
    private String name;
    private String email;
    private int level;
    private Long timeLineId;
}
