package com.nkosy.floating;

/**
 * Created by nkosy on 2015/02/11.
 */

import com.nkosy.truth.TruthObject;
import com.nkosy.floatingPoints.FloatingPoints;
import com.nkosy.integers.Integers;
import com.nkosy.nullness.Nullness;
import com.nkosy.objectEquality.ObjectEquality;
import com.nkosy.objectIndentity.ObjectIdentity;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestApp {
    FloatingPoints f = new FloatingPoints();
    Integers i = new Integers();
    ObjectEquality o = new ObjectEquality();
    ObjectIdentity oi = new ObjectIdentity();
    TruthObject to = new TruthObject();
    Nullness n = new Nullness();

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

    @After
    public void tearDown() throws Exception {


    }
}
