package edu.murraystate.csis.inference;

/**
 * Created by Brian Rickard on 9/9/16.
 */
public class ByteTypeTester extends TryCatchTester<Byte>{
    public ByteTypeTester(){
        super("Byte", Byte::parseByte);
    }
}
