/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.datasource;

import com.jmamoon.socialloansystem.datasource.factory.HouseFactory;
import com.jmamoon.socialloansystem.datasource.factory.LoanRequestFactory;
import com.jmamoon.socialloansystem.datasource.factory.PersonFactory;
import com.jmamoon.socialloansystem.datasource.factory.PieceOfLandFactory;
import com.jmamoon.socialloansystem.model.LoanRequest;
import com.jmamoon.socialloansystem.model.Person;
import com.jmamoon.socialloansystem.model.Property;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class DataSourceHardCoded {

    public static List<LoanRequest> getRequests() {

        List<LoanRequest> res = new ArrayList<>();
        
        res.add(getLoanRequest1());
        res.add(getLoanRequest2());
        res.add(getLoanRequest3());
        res.add(getLoanRequest4());
        res.add(getLoanRequest5());

        return res;
    }

    private static Person getPerson1() {
        return PersonFactory.create("Jose Arandia", 25, 2000);
    }

    private static Person getPerson2() {
        return PersonFactory.create("Marta Perez", 31, 2000);
    }

    private static Person getPerson3() {
        return PersonFactory.create("Juan Gomez", 17, 3500);
    }

    private static Person getPerson4() {
        return PersonFactory.create("Pablo Sanchez", 72, 3000);
    }

    private static Property getProperty1() {
        return HouseFactory.create("Cochabamba, Bolivia", 720000);
    }

    private static Property getProperty2() {
        return PieceOfLandFactory.create("Cochabamba, Bolivia", 80000);
    }

    private static LoanRequest getLoanRequest1() {
        return LoanRequestFactory.create(getPerson1(), getProperty1());
    }

    private static LoanRequest getLoanRequest2() {
        return LoanRequestFactory.create(getPerson2(), getProperty1());
    }

    private static LoanRequest getLoanRequest3() {
        return LoanRequestFactory.create(getPerson3(), getProperty1());
    }

    private static LoanRequest getLoanRequest4() {
        return LoanRequestFactory.create(getPerson4(), getProperty1());
    }

    private static LoanRequest getLoanRequest5() {
        return LoanRequestFactory.create(getPerson2(), getProperty2());
    }

}
