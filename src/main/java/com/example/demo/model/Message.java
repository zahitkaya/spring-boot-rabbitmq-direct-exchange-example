package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Message implements Serializable { //Kuyruğa byte array göndermemiz gerekiyor

    int id;
    String message;
    Date createdAt;
    Boolean seen;

}
