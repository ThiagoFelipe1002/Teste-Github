package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informação do Funcionário
        //Tipos numéricos inteiros
        byte anosDeEmpresa = 127;
        short numeroDeVoos = 32767;
        int id = 2147483647;
        long pontosAcumulados = 2147483648L;

        //Tipos numéricos reais
        float salario = 14_445.44f;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo Boleano
        boolean estaDeFerias = false; //true

        //Tipo Caractere
        char status = 'A'; //Ativo

        //Dias de Empresa
        System.out.println(anosDeEmpresa *365);

        //Número de Viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por Real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias: " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
