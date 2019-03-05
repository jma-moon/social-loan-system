/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource;

import com.jmamoon.socialloansystem.model.LoanRequest;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class DataSource {

    public static List<LoanRequest> getRequests() {

        return DataSourceHardCoded.getRequests();
    }

}
