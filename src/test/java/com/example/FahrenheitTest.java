package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FahrenheitTest {
    private Conversor convTest= new Conversor('F', 32);

    @Test
    public void testFahreinheitCelsius(){
        convTest.converte('C');
        System.out.println(convTest);
        assertEquals(convTest.getTemp().getEscala(), 'C');
        assertEquals(convTest.getTemp().getTemperatura(),10.00);
    }
}
