/** 
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.backend.java.lib.runtime;

public class ABSInitObjectCall<T extends ABSObject> extends AbstractAsyncCall<T> {

    public ABSInitObjectCall(Task<?> sender, ABSObject source, T target) {
        super(sender, source, target);
    }

    @Override
    public Object execute() {
        target.__ABS_init();
        return null;
    }

    @Override
    public String methodName() {
        return "initialization";
    }

}
