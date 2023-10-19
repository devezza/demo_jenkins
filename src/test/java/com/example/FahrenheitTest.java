package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FahrenheitTest {
    private Conversor convTest;

    @BeforeEach
    public void setup(){
        convTest = new Conversor('F', 32);
    }

    @Test
    public void testFahreinheitCelsius(){
        convTest.converte('C');
        assertEquals(convTest.getTemp().getEscala(), 'C');
        assertEquals(convTest.getTemp().getTemperatura(),0.00);
    }
}
