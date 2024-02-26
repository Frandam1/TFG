package com.microservice.User.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int level;

    @Column(name = "timeline_id")
    private Long timeLineId; // Este atributo va a relacionar al usuario con los diferentes mcsv.
}
