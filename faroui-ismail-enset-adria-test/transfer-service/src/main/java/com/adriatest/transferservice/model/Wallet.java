package com.adriatest.transferservice.model;

import com.adriatest.transferservice.model.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wallet {
    private String id; // UUID
    private double balance;
    private Date creationDate;
    private String currency;
    private Client owner;
}
