package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CelsisusTest {
    private Conversor convTest = new Conversor('C', 10);

    @BeforeEach
    public void setup(){
        convTest = new Conversor('C', 10);
    }

    @Test
    public void testCelsiusFahreinheit(){
        System.out.println("Valor de convTest:" + convTest);
        convTest.converte('F');
        System.out.println("Saindaaaa" + convTest.getTemp().getEscala());
        assertEquals(convTest.getTemp().getEscala(), 'F');
        assertEquals(convTest.getTemp().getTemperatura(),50.00);
    }
}
