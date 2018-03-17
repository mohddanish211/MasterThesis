/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.backend.java.lib.runtime;

import java.util.Collections;
import java.util.List;

import abs.backend.java.lib.types.ABSRef;
import abs.backend.java.lib.types.ABSValue;

public abstract class AbstractAsyncCall<T extends ABSRef> implements AsyncCall<T> {

    protected final ABSObject source;
    protected final T target;
    protected final Task<?> sender;

    public AbstractAsyncCall(ABSObject source, T target) {
        this(ABSRuntime.getCurrentTask(),source,target);
    }
    
    public AbstractAsyncCall(Task<?> sender, ABSObject source, T target) {
        this.sender = sender;
        this.source = source;
        this.target = target;
    }
    
    @Override
    public List<ABSValue> getArgs() {
        return Collections.emptyList();
    }

    @Override
    public T getTarget() {
        return target;
    }

    @Override
    public ABSObject getSource() {
        return source;
    }

    public Task<?> getSender() {
        return sender;
    }
    
}
