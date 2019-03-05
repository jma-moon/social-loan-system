/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.factory;

import com.jmamoon.socialloansystem.datasource.builder.HouseBuilder;
import com.jmamoon.socialloansystem.model.House;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class HouseFactory {

    public static House create(String location, double price) {
        return (House) new HouseBuilder()
                .setLocation(location)
                .setPrice(price)
                .build();
    }

}
