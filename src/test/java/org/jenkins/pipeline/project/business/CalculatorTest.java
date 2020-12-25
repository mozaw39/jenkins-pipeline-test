package org.jenkins.pipeline.project.business;

import org.junit.After;
import org.junit.Test;

import static org.jenkins.pipeline.project.business.Calculator.sum;
import static org.junit.Assert.*;

public class CalculatorTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumTest() {
        assertEquals(3, sum(2,2) );
    }
}