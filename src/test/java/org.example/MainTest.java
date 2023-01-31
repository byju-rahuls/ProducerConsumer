package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testPC() throws InterruptedException {
        Main obj=new Main();
        assertEquals(1,obj.testCases(1));
        assertEquals(1,obj.testCases(2));
    }
}