/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.backend.java.lib.net;

import abs.backend.java.lib.net.msg.MsgQueue;

/**
 * Describes an Arc in a network
 * 
 * @author Jan Schäfer
 *
 */
public interface Arc {
    public NetNode getSource();
    public NetNode getTarget();
    public MsgQueue getQueue();
}
