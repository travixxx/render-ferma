package com.render.ferm.org.entity;

import com.render.ferm.org.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date startExpired;
    private Date endExpired;
    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Status status;
}
