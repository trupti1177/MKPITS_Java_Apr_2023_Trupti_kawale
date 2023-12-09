package com.example.SB_PostConstruct_PreDestroy.rest;


public class LoanAccount implements Account{
    @Override
    public String getDetails() {
        return "Loan account";
    }
}