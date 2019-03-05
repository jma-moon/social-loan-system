/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.loanrequestprocessor.droolsimpl;

import com.jmamoon.socialloansystem.loanrequestprocessor.droolsimpl.knowledgesession.StatefulKnowledgeSessionSingleton;
import org.drools.runtime.StatefulKnowledgeSession;
import com.jmamoon.socialloansystem.loanrequestprocessor.LoanRequestProcessor;
import com.jmamoon.socialloansystem.model.LoanRequest;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class LoanRequestProcessorDrools implements LoanRequestProcessor {

    final StatefulKnowledgeSession ksession = StatefulKnowledgeSessionSingleton.instance();

    public LoanRequestProcessorDrools() {
    }

    @Override
    public LoanRequest processRequest(LoanRequest request) {
        
        this.ksession.insert(request);
        this.ksession.fireAllRules();
        
        return request;
    }

}
