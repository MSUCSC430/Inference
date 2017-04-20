package edu.murraystate.csis.inference;

import java.util.Optional;

/**
 * Created by Brian Rickard on 9/11/16.
 */
public class CharacterTypeTester implements TypeTester{
    
    @Override
    public Optional<String> test(String sample) {
        Optional<String> result = Optional.empty();
        Optional<Character> parsedCharacter = parseCharacter(sample);
        String parsedCharactertoString = parsedCharacter.toString();
        
        if(parsedCharacter.isPresent()){
            result = Optional.of(parsedCharactertoString);
        }
        
        return result;
}

    
    public Optional<Character> parseCharacter(String testValue){
        Optional<Character> result = Optional.empty();
        
        if(testValue.length() == 1)
        {
             Character value = testValue.charAt(1);
             result = Optional.of(value);
        }
        return result;
    }
}

