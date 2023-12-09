package com.example.SB_PostConstruct_PreDestroy.config;

import com.example.SB_PostConstruct_PreDestroy.rest.Account;
import com.example.SB_PostConstruct_PreDestroy.rest.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Account loanAccount(){
        return new LoanAccount();
    }
}