package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom Dia X";
        s = s.concat("!!!");
        s = s.toUpperCase();
        s = s.replace("X", "pessoa");

        System.out.println(s);

        String x = "Othon".toUpperCase();
        System.out.println(x);

        String y = "Bom Dia X"
                .replace("X", "Othon")
                .toUpperCase()
                .concat("!");
        System.out.println(y);

        // Tipos primitivos não tem o operador " . "
        // int a = 3;
        // a.



    }
}
