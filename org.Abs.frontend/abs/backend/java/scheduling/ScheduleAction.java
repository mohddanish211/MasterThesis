/** 
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.backend.java.scheduling;

import abs.backend.java.lib.runtime.COG;
import abs.backend.java.lib.runtime.Task;
import abs.backend.java.observing.TaskView;

/**
 * Abstract class which represents a global scheduling action
 * 
 * @author Jan Schäfer
 *
 */
public abstract class ScheduleAction {
    private final COG cog;
    private boolean executed;

    public ScheduleAction(COG cog) {
        this.cog = cog;
    }

    public COG getCOG() {
        return cog;
    }

    public TaskView getTask() {
        return null;
    }

    public synchronized void execute() {
        executed = true;
        notify();
    }

    public synchronized void await() throws InterruptedException {
            while (!executed) {
                wait();
            }
    }

    public abstract String shortString();

}
