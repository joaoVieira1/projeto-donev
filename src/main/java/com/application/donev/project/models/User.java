package com.application.donev.project.models;


import com.application.donev.project.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name="Users")
@Table(name="Users")
@EqualsAndHashCode(of="id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    public User(UserDTO userDTO){
        setUsername(userDTO.username());
        setEmail(userDTO.email());
        setPassword(userDTO.password());
    }

}
