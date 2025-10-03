package com.gstech.desafioBackend.orm;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User {

    private String cpf;

    public Customer() {

    }
    public Customer(Long id, String fullName, String email, String cpf) {
        super(id, fullName, email);
        this.cpf = cpf;
    }
}
