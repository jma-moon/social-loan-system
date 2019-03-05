/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.builder;

import com.jmamoon.socialloansystem.model.Property;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class PropertyBuilder {

    public Property property;

    public PropertyBuilder setLocation(String location) {

        this.property.setLocation(location);
        return this;
    }

    public PropertyBuilder setPrice(double price) {

        this.property.setPrice(price);
        return this;
    }

    public Property build() {
        return this.property;
    }
}
