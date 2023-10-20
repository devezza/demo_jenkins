package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CelsisusTest {
    private Conversor convTest = new Conversor('C', 0);

    @BeforeEach
    public void setup(){
        convTest = new Conversor('C', 10);
    }

    @Test
    public void testCelsiusFahreinheit(){
        convTest.converte('F');
        assertEquals(convTest.getTemp().getEscala(), 'F');
        assertEquals(convTest.getTemp().getTemperatura(),50.00);
    }
}
