package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        // Inferencia de tipos.
        var valorA = 2; // delcarou e inicializou a variavel.
        System.out.println(valorA); // printou a variavel.

        double valorB = 2.1; // declarou e inicializou como tipo double
        System.out.println(valorB); // printou a variavel.

        double valorC; // declarou como tipo  double.
        valorC = 23.4; // inicializou a variavel.
        System.out.println(valorC); // printou a variavel.

        var valorG = 12.3; // declarou e inicializou como tipo double.
        valorG = 12; // e atualizou como tipo inteiro.
        System.out.println(valorG);

        // O QUE NÃO PODE SER FEITO POR CAUSA DO FORTEMENTE TIPADO
        /*

       MOTIVO: Quando usar o var a variaverl tem que ser declarada e inicializada sempre
       var valorD;
       valorD = "Não Pode";
       System.out.println(valorD);

       MOTIVO: Se usar o var não pode mudar de tipo o Java não vai fazer a mudança do tipo.
       var valorE = 12; --> declarou e inicializou como um inteiro.
       valorE = "Não Pode"  --> Atualizou a variavel para uma string.
       System.out.println(valorE);

       MOTIVO: Se usar o var não pode mudar de tipo o Java não vai fazer a mudança do tipo.
       var valorF = 12; --> declarou e inicializou como um inteiro.
       valorF = 12.1;   --> Atualizou a variavel para um double.
       System.out.println(valorF);

        */












    }
}
