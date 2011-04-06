// Copyright (c) 2009, 2011 by Patrick Juola.   All rights reserved.  All unauthorized use prohibited.  
/**
 **/
package com.jgaap.eventDrivers;

import com.jgaap.generics.Document;
import com.jgaap.generics.EventSet;

/**
 * Extract bigrams of characters as features.
 *
 */
public class POSEnneaGramEventDriver extends NGramEventDriver {

    @Override
    public String displayName(){
    	return "POS EnneaGrams";
    }
    
    @Override
    public String tooltipText(){
    	return "Part-of- Speech Enneairs in Sequence";
    }
    
    @Override
    public boolean showInGUI(){
    	return false;
    }

  private NGramEventDriver theDriver;

    @Override
    public EventSet createEventSet(Document ds) {
        theDriver = new NGramEventDriver();
        // default value of N is 2 already
        theDriver.setParameter("N", "9");
        theDriver.setParameter("underlyingEvents", "PartOfSpeechEventDriver");
        return theDriver.createEventSet(ds);
    }
}