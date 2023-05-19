package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informação do Funcionario

        // Tipos numericos Inteiros.
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 4535;
        long pontosAcumulados = 3_145_145_113L;
        // Tipos numericos Reais ou com Ponto Flutuante.
        float salario = 1323.44F; // Sempre vai ter que colocar a letra F
        double vendasAcumuladas = 2_345_345.45;
        // Tipo Booleano
        boolean estaDeFerias = true; // Valor true ou false
        // Tipo Char
        char status = 'A'; // Ativo

        // Dias de Empresa
        System.out.println(anosDeEmpresa * 365);
        // Numero de viagens
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        // Ferias
        System.out.println(id + ":ganha -> "+ salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status );

    }
}
