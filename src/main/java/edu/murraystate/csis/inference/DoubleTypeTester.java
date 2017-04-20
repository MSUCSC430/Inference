package edu.murraystate.csis.inference;

/**
 * Created by Brian Rickard on 9/9/2016.
 */
public class DoubleTypeTester extends TryCatchTester<Double> {
    public DoubleTypeTester(){
        super("Double", Double::parseDouble);
    }
}
