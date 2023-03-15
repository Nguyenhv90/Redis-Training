package com.hvn.SpringBootRedis.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
