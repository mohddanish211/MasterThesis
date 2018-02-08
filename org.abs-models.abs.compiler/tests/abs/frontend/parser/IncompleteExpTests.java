/** 
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.frontend.parser;

//These tests are deactivated in AllFrontendTests.java since the tested functionality has not been implemented in the antlr-based parser.

import org.junit.Test;
import org.junit.Ignore;

import abs.frontend.FrontendTest;
import static abs.ABSTest.Config.*;

@Ignore
public class IncompleteExpTests extends FrontendTest {
    
    @Test
    public void incompleteSyncAccess() {
        assertParseOk("{ x = x.; }", ALLOW_INCOMPLETE_EXPR); 
        assertParseOk("{ x.; }", ALLOW_INCOMPLETE_EXPR);
    }

    @Test
    public void incompleteAsyncAccess() {
        assertParseOk("{ x = x!; }", ALLOW_INCOMPLETE_EXPR); 
        assertParseOk("{ x!; }", ALLOW_INCOMPLETE_EXPR); 
    }
    
    @Test
    public void incompleteThisAsyncAccess() {
        assertParse(" { this!x await x!foo();}", ALLOW_INCOMPLETE_EXPR, EXPECT_PARSE_ERROR); 
    }

    @Test
    public void incompleteNewExp() {
        assertParseOk("{ new local ; }", ALLOW_INCOMPLETE_EXPR); 
        assertParseOk("{ new ; }", ALLOW_INCOMPLETE_EXPR); 
        assertParseOk("{ x = new local ; }", ALLOW_INCOMPLETE_EXPR); 
        assertParseOk("{ x = new ; }", ALLOW_INCOMPLETE_EXPR); 
    }
    
    @Test
    public void incompleteStmt() {
        assertParseOk("class C { Unit m() { I i; i.; } }", ALLOW_INCOMPLETE_EXPR); 
    }
}
