/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.backend.java;

import org.junit.Test;

public class JavaFLITest extends JavaBackendTest {

    private final static String EXAMPLE_CODE = "import * from ABS.FLI; interface I { Unit foo(String s); } " +
    "[Foreign] class A implements I { Unit foo(String s) { } } { Bool testresult = True; I i = new local A(); i.foo(\"test\"); } ";
    
    @Test
    public void foreignClass() throws Exception {
        assertValidStdLib(EXAMPLE_CODE);
    }
    
    @Test
    public void foreignClass2() throws Exception {
        assertEvalTrue("module BackendTest; " + EXAMPLE_CODE);
        
    }

}
