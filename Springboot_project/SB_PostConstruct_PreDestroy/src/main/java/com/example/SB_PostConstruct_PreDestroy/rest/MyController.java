package com.example.SB_PostConstruct_PreDestroy.rest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private Account account;

//    public MyController(@Qualifier("currentAccount") Account account) {
//        this.account = account;
//    }

    public MyController(@Qualifier("loanAccount") Account account){
        this.account=account;
    }

    @GetMapping("/")
    public String getMessage(){
        return account.getDetails();
    }



}