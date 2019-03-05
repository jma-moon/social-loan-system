/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource.factory;

import com.jmamoon.socialloansystem.datasource.builder.PieceOfLandBuilder;
import com.jmamoon.socialloansystem.model.PieceOfLand;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PieceOfLandFactory {
    
    public static PieceOfLand create(String location, double price) {
        return (PieceOfLand) new PieceOfLandBuilder()
                .setLocation(location)
                .setPrice(price)
                .build();
    }

}
