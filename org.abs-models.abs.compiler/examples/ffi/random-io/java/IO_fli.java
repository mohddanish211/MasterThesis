package Env;

import abs.backend.java.lib.types.*;

public class IO_fli extends IO_c {
    
    public ABSUnit fli_println(ABSString s) {
        System.out.println(s);
        return ABSUnit.UNIT;
    }
}

