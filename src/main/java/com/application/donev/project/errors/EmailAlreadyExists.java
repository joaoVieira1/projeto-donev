package com.application.donev.project.errors;

public class EmailAlreadyExists extends RuntimeException{

    public EmailAlreadyExists(){
        super("O email inserido já está cadastrado.");
    }

}
