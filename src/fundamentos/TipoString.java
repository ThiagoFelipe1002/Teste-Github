package fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2)); //Mostra o caractere correspondente ao número (começa do 0).

        String s = "Boa tarde!";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "\nNome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalário: " + salario + "\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);

        System.out.println("\n\nO senhor " + nome + " " + sobrenome + " tem " + idade + " anos e ganha R$ " + salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println();
        System.out.println("Frase qualquer".contains("qual")); //Mostra true ou false se existir a palavra "qual".
        System.out.println("Frase qualquer".indexOf("qual")); // Mostra em qual número de item "qual" começa.
        System.out.println("Frase qualquer".substring(6)); //Escreve a partir do intem "x".
        System.out.println("Frase qualquer".substring(6, 10)); //Escreve a partir do "x" e termina em "y"-1.

    }
}
