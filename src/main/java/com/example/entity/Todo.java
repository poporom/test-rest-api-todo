package com.example.entity;

import com.example.model.TodoStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="TODO")
public class Todo {

    @Id
    @SequenceGenerator(name = "todo_id_generator", sequenceName = "user_id_seq")
    @GeneratedValue(generator = "todo_id_generator")
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private User user;

    private Timestamp created;

    private Timestamp updated;

    @Enumerated(EnumType.STRING)
    private TodoStatus status;


}
