/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.loanrequestprocessor.droolsimpl.knowledgesession;

import org.drools.runtime.StatefulKnowledgeSession;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class StatefulKnowledgeSessionSingleton {

    private static final StatefulKnowledgeSession K_SESSION = StatefulKnowledgeSessionFactory.create("SocialLoanRules.drl");

    private StatefulKnowledgeSessionSingleton() {
    }

    public static StatefulKnowledgeSession instance() {
        return K_SESSION;
    }

}
