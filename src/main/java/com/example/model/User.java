package com.example.model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String password;
    @NotEmpty
    private boolean active;
    @NotEmpty
    private String roles;
}