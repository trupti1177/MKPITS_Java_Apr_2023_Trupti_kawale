package com.example.SB_PostConstruct_PreDestroy.rest;
import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account{

    public SavingAccount(){
        System.out.println("This is saving constructor");
    }

    @Override
    public String getDetails() {
        return "This is saving Account";
    }
}