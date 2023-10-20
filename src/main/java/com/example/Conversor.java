package com.example;

public class Conversor {
    private Temperatura temp;

    public Conversor(char escala, double temperatura){
        this.temp = new Temperatura(escala, temperatura);
    }

    public Temperatura getTemp(){
        return this.temp;
    }
    
    public void celsiusFahrenheit(){
        double tempCelsius, tempFahreinheit;

        tempCelsius = this.getTemp().getTemperatura();
        tempFahreinheit = (1.8 * tempCelsius +32.0);

        System.out.println(tempFahreinheit);

        this.getTemp().setEscala('F');
        this.getTemp().setTemperatura(tempFahreinheit);
    }

    public void fahrenheitCelsius(){
        double tempCelsius, tempFahreinheit;

        tempFahreinheit = this.getTemp().getTemperatura()
        tempCelsius = (tempFahreinheit - 32.0)/1.8;

        System.out.println(tempCelsius);
        this.getTemp().setEscala('C');
        this.getTemp().setTemperatura(tempCelsius);
    }

    public void converte(char escala){
        System.out.println("Convertendo...");
        switch(escala){
            case 'F':
                this.celsiusFahrenheit();
                break;
            case 'C':
                this.fahrenheitCelsius();
                break;
            default:
                System.out.println("Escala invalida: use 'C' ou 'F'");
        }
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(),this.getTemp().getEscala());
    }
}
