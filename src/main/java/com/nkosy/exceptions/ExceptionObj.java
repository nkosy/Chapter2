package com.nkosy.exceptions;

import java.util.ArrayList;

/**
 * Created by nkosy on 2015/02/12.
 */
public class ExceptionObj {
    public void zoe()
    {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
}
