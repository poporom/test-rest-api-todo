package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="USERS")
public class User {

    @Id
    @SequenceGenerator(name = "user_id_generator", sequenceName = "user_id_seq")
    @GeneratedValue(generator = "user_id_generator")
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created")
    private Timestamp created;

    @Column(name = "updated")
    private Timestamp updated;

    public void setPassword(String password) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        this.setUpdated( now );
        this.password = password;
    }

}
