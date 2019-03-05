package com.jmamoon;

import com.jmamoon.socialloansystem.datasource.DataSource;
import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessor;
import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessorFactory;
import com.jmamoon.socialloansystem.model.LoanRequest;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class Main {

    public static void main(String[] args) {

        LoanRequestProcessor loanRequestProcessor = LoanRequestProcessorFactory.create();
        List<LoanRequest> requests = DataSource.getRequests();

        requests.forEach((loanRequest) -> {

            loanRequestProcessor.processRequest(loanRequest);
        });

        requests.forEach((loanRequest) -> {

            if (loanRequest.isAccepted()) {
                System.out.println(loanRequest.getPerson() + " is able to get a loan for " + loanRequest.getProperty());
            } else {
                System.out.println(loanRequest.getPerson() + " has the following issues to get a loan for " + loanRequest.getProperty());
                loanRequest.getIssues().forEach((issue) -> {
                    System.out.println(issue);
                });
            }

            System.out.println();
        });

    }

}
