package com.nkosy.test;

/**
 * Created by nkosy on 2015/02/11.
 */

import com.nkosy.ArrayContent.ArrayContent;
import com.nkosy.exceptions.ExceptionObj;
import com.nkosy.notNull.NonNull;
import com.nkosy.timeout.TimeTest;
import com.nkosy.truth.TruthObject;
import com.nkosy.floatingPoints.FloatingPoints;
import com.nkosy.integers.Integers;
import com.nkosy.nullness.Nullness;
import com.nkosy.objectEquality.ObjectEquality;
import com.nkosy.objectIndentity.ObjectIdentity;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestApp {
    FloatingPoints f = new FloatingPoints();
    Integers i = new Integers();
    ObjectEquality o = new ObjectEquality();
    ObjectIdentity oi = new ObjectIdentity();
    TruthObject to = new TruthObject();
    Nullness n = new Nullness();
    NonNull non = new NonNull();
    ExceptionObj ex = new ExceptionObj();
    TimeTest tm = new TimeTest();
    ArrayContent ac = new ArrayContent();

    @Before
    public void setUp() throws Exception {


    }

    //Test Floating Points
    @Test
    public void testFloating() throws Exception {
        //Assert.assertEquals(4.000, f.calculate());
    }

    //Test Integers
    @Test
    public void testInteger() throws Exception {
        Assert.assertEquals(4, i.calculate());
    }

    //Test Object Equality
    @Test
    public void testEquality() throws Exception {
       Assert.assertEquals(o.string1, o.string2);
    }

    //Test Object Identity
    @Test
    public void testIdentity() throws Exception {
        Assert.assertSame(oi.obj1, oi.obj1);
    }

    //Test Object truth
    @Test
    public void truthObject() throws Exception {
        Assert.assertTrue(to.Coco());
    }

    //Nullness
    @Test
    public void nullness() throws Exception {
        Assert.assertNull(n.zoe());
    }

    //NonNullness
    @Test
    public void nonnull() throws Exception {
        Assert.assertNotNull(non.zoe());
    }

    //Failing & Ignored as well
    @Ignore
    @Test
    public void failing() throws Exception {
        Assert.fail("Just Failed for fun");
    }

    //Exception
    @Test(expected=IndexOutOfBoundsException.class)
    public void execptionObj() throws Exception {
        ex.zoe();
    }

    //Timeout
    @Test(timeout=5000)
    public void timeoutObj() throws Exception {
        tm.zoe();
    }

    @Test
    public void testArray() throws Exception {
        Assert.assertEquals(ac.Array1[1], ac.Array2[1]);

    }

    @After
    public void tearDown() throws Exception {


    }
}
