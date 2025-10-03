package com.gstech.desafioBackend.orm;

public class Shopkeeper  extends User{

    private String cnpj;

    public Shopkeeper(Long id, String fullName, String email, String cnpj) {
        super(id, fullName, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
