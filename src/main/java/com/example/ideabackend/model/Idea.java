package com.example.ideabackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "idea")
public class Idea implements Serializable {

    @Column(name = "id")
    @Id
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "timestamp")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    private Timestamp timestamp;
}
