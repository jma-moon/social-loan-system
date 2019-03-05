/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialloansystem.loanrequestprocessor.droolsimpl.knowledgesession;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class StatefulKnowledgeSessionFactory {

    public static StatefulKnowledgeSession create(String filename) {
        KnowledgeBase kBase = readKnowledgeBase(filename);
        return kBase.newStatefulKnowledgeSession();
    }

    private static KnowledgeBase readKnowledgeBase(String filename) {

        KnowledgeBuilder kBuilder = createKnowledgeBuilder(filename);

        try {
            verifyErrors(kBuilder);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + " using " + filename);
        }

        KnowledgeBase kBase = createKnowledgeBase(kBuilder);

        return kBase;
    }

    private static KnowledgeBuilder createKnowledgeBuilder(String filename) {
        final KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kBuilder.add(ResourceFactory.newClassPathResource(filename), ResourceType.DRL);
        return kBuilder;
    }

    private static void verifyErrors(final KnowledgeBuilder kBuilder) throws IllegalArgumentException {
        if (kBuilder.hasErrors()) {
            kBuilder.getErrors().forEach((error) -> {
                System.err.println(error);
            });
            throw new IllegalArgumentException("Error creating StatefulKnowledgeSession");
        }
    }

    private static KnowledgeBase createKnowledgeBase(KnowledgeBuilder kBuilder) {
        KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase();
        kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
        return kBase;
    }

}
