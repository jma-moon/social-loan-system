/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.builder;

import com.jmamoon.socialloansystem.model.LoanRequest;
import com.jmamoon.socialloansystem.model.Person;
import com.jmamoon.socialloansystem.model.Property;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class LoanRequestBuilder {

    private LoanRequest loanRequest;

    public LoanRequestBuilder() {
        this.loanRequest = new LoanRequest();
    }

    public LoanRequestBuilder setPerson(Person person) {

        this.loanRequest.setPerson(person);
        return this;
    }

    public LoanRequestBuilder setProperty(Property property) {

        this.loanRequest.setProperty(property);
        return this;
    }

    public LoanRequest build() {
        return this.loanRequest;
    }

}
