/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.factory;

import com.jmamoon.socialloansystem.datasource.builder.PersonBuilder;
import com.jmamoon.socialloansystem.model.Person;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonFactory {

    public static Person create(String name, int age, double affordablePaymentPerMonth) {
        return new PersonBuilder()
                .setName(name)
                .setAge(age)
                .setName(affordablePaymentPerMonth)
                .build();
    }

}
