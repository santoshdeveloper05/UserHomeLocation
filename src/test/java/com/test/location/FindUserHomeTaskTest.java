package com.test.location;

import java.util.List;

import org.junit.Test;

import com.test.model.UserHome;
import com.test.model.Visit;

import junit.framework.TestCase;

public class FindUserHomeTaskTest extends TestCase {

    private List<Visit> visits = null;
    private FindUserHomeTask findUserHomeTask = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        visits = VisitTestData.getVisits();
        findUserHomeTask = new FindUserHomeTask();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        visits.clear();
    }

    @Test
    public void testUserHome() {
        UserHome userHome = findUserHomeTask.run(visits);

        assertNotNull(userHome);
        assertNotNull(userHome.getLatitude());
        assertNotNull(userHome.getLongitude());
        assertNotNull(userHome.getHighesTimeSpent());
        assertNotNull(userHome.isHomeLocation());

        assertEquals("45.12", userHome.getLatitude());
        assertEquals("-118.12", userHome.getLongitude());
        assertEquals(84, userHome.getHighesTimeSpent());
        assertEquals(true, userHome.isHomeLocation());
    }
}