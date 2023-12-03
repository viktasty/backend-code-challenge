package org.packing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParsingTest {
    Parsing parsing;
    @Test
    public void parseInputTest(){
        parsing = new Parsing();
        Commodity expected = new Commodity((byte) 1,15.3f,(byte) 34);
        Assertions.assertEquals(expected, parsing.parseOne("(1,15.3,$34)"));
    }
}