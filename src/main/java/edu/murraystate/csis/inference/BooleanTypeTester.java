package edu.murraystate.csis.inference;

/**
 * Created by Brian Rickard on 9/9/16.
 */
public class BooleanTypeTester extends TryCatchTester{
    public BooleanTypeTester(){
        super("Boolean",
                x -> ("true".equals(x))
        );
    }
}

