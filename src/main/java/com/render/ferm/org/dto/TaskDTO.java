package com.render.ferm.org.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class TaskDTO {
    private Long id;
    private String name;
    private Date startExpired;
    private Date endExpired;
}
