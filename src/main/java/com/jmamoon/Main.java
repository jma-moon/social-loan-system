package com.jmamoon;

import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessor;
import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessorFactory;
import com.jmamoon.socialloansystem.model.House;
import com.jmamoon.socialloansystem.model.LoanRequest;
import com.jmamoon.socialloansystem.model.Person;

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

        Person person = new Person();
        person.setName("Jose");
        person.setAge(25);
        person.setAffordablePaymentPerMonth(2000);

        House house = new House();
        house.setLocation("Cochabamba");
        house.setPrice(720000);

        LoanRequest loanRequest = new LoanRequest();
        loanRequest.setPerson(person);
        loanRequest.setProperty(house);

        loanRequestProcessor.processRequest(loanRequest);

        System.out.println("Loan request: " + loanRequest.isAccepted());
    }

}
