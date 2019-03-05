/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.factory;

import com.jmamoon.socialloansystem.datasource.builder.LoanRequestBuilder;
import com.jmamoon.socialloansystem.model.LoanRequest;
import com.jmamoon.socialloansystem.model.Person;
import com.jmamoon.socialloansystem.model.Property;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class LoanRequestFactory {
    
    public static LoanRequest create(Person person, Property property) {
        return new LoanRequestBuilder()
                .setPerson(person)
                .setProperty(property)
                .build();
    }
    
}
