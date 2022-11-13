package fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double r; // Variável Double (10 decimais) mais precisa que Float (6 decimais).
        final double PI = 3.14159; // "final" para definir que o valor da variável não poderá ser alterado.
        double area;

        System.out.println("Digite o valor do Raio: ");
        Scanner ler = new Scanner(System.in);
        r = ler.nextDouble();
        area = PI * Math.pow(r, 2); // Math.pow(número, expoente).

        System.out.println("Área = " + area + " m²");
    }
}
