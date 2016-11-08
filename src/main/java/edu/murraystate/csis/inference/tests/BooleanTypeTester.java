package edu.murraystate.csis.inference.tests;

import java.util.HashSet;
import java.util.Set;

public class BooleanTypeTester implements TypeTester{
    final String typeString = "Boolean";

    @Override
    public TestResult test(String sample) {
        
        if(sample.contentEquals("true") || sample.contentEquals("false")){
            Set<String> possibleTypes = new HashSet<>();
            possibleTypes.add(typeString);
            return new TestResult(possibleTypes, sample);
        }else{
            return new TestResult(sample);
        }
    }
}