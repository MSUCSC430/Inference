package edu.murraystate.csis.inference;

/**
 * Created by Brian Rickard on 9/9/2016.
 */
public class ShortTypeTester extends TryCatchTester<Short> {
    public ShortTypeTester() {
        super("Short", Short::parseShort);
    }
}
