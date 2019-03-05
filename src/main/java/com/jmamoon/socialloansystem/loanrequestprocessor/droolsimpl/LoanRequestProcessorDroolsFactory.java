/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.loanrequestprocessor.droolsimpl;

import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessor;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class LoanRequestProcessorDroolsFactory {
    
    public static LoanRequestProcessor create() {
        return new LoanRequestProcessorDrools();
    }
    
}
