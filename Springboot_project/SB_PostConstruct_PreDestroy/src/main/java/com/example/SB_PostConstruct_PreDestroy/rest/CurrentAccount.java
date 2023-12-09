package com.example.SB_PostConstruct_PreDestroy.rest;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account{
    public CurrentAccount(){
        System.out.println("This is Current Account");
    }

    @Override
    public String getDetails() {
        return "This is Current Account";
    }

    @PostConstruct
    public void startUpWork(){
        System.out.println("Start Up work" + getClass().getSimpleName());
    }
    @PreDestroy
    public void endWork(){
        System.out.println("End the work" + getClass().getSimpleName());
    }
}
