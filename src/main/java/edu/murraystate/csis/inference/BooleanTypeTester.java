package edu.murraystate.csis.inference;

import java.util.Optional;

/**
 * Created by Brian Rickard on 9/9/16.
 */
public class BooleanTypeTester implements TypeTester{
    public BooleanTypeTester(){
       
    }
    
    @Override
    public Optional<String> test(final String sample){
        
        Optional<String> result = Optional.empty();
        Optional<Boolean> parsedBoolean = parseBoolean(sample);
        String parsedBooleanString = parsedBoolean.toString();
        
        if(parsedBoolean.isPresent()){
            result = Optional.of(parsedBooleanString);
        }
        
        return result;
    }
    
    public Optional<Boolean> parseBoolean(String testValue){
        
        Optional<Boolean> result;
        
        result = stringEqualsBoolean(testValue, true);
        
        if(!result.isPresent()){
            result = stringEqualsBoolean(testValue, false);
        }
        
        return result;
    }
    
    public Optional<Boolean> stringEqualsBoolean(String stringTestValue, Boolean booleanTestValue){
        Optional<Boolean> result = Optional.empty();
        
        if(stringTestValue.equals(booleanTestValue.toString())){
            result = Optional.of(booleanTestValue);
        }
        
        return result;
    }
}

