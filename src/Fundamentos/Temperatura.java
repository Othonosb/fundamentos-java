package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // Duas constantes.
        final int valorA = 32;
        final double valorB = 5 / 9.0;
        // Duas variaveis.
        double farenheit = 86;
        double celsius = (farenheit - valorA) * valorB;
        // Print do resultado.
        System.out.println("A temperatura em Celsius é " + celsius + "˚C.");

        // Atualização da variavel.
        farenheit = 150;
        celsius = (farenheit - valorA) * valorB;
        // Print do resultado.
        System.out.println("A temperatura em Celsius é " + celsius + "˚C.");

    }
}
