package exercicio1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("******************");
        System.out.println("****TEMP v 1.0****");
        System.out.println("******************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Celsius:");
        double tempCelsius = scanner.nextDouble();

        TemperaturaCelsius temperatura = new TemperaturaCelsius();
        temperatura.setValor(tempCelsius);

        double tempFahrenheit = temperatura.obtemValorEmFahrenheit();
        double tempKelvin = temperatura.obtemValorEmKelvin();

        System.out.println("Valor em Fahrenheit: " + tempFahrenheit);
        System.out.println("Valor em Kelvin:" + tempKelvin);

    }
}