package com.artoos.racing;


import android.content.Context;
import android.test.AndroidTestCase;

import org.junit.Before;
import org.robolectric.Robolectric;

/**
 * Created by Nakhimovich on 8/23/14.
 */
public abstract class BaseTestCase extends AndroidTestCase
{
    Context context;

    @Before
    public void setUp() throws Exception
    {
        super.setUp();
        context = Robolectric.application;
    }
}
