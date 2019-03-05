/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.builder;

import com.jmamoon.socialloansystem.model.Person;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder setName(String name) {

        this.person.setName(name);
        return this;
    }

    public PersonBuilder setAge(int age) {

        this.person.setAge(age);
        return this;
    }

    public PersonBuilder setName(double affordablePaymentPerMonth) {

        this.person.setAffordablePaymentPerMonth(affordablePaymentPerMonth);
        return this;
    }

    public Person build() {
        return this.person;
    }

}
