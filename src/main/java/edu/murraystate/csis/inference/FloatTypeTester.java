package edu.murraystate.csis.inference;

/**
 *Created by Brian Rickard on 9/9/2016.
 */
public class FloatTypeTester extends TryCatchTester<Float>{
    public FloatTypeTester() {
        super("Float", Float::parseFloat);
    }
}
