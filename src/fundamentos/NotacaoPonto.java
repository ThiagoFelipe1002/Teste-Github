package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); //Substituir
        s = s.toUpperCase(); //Colocar todas as letras em maiúsculo.
        s = s.concat("!!!");

        System.out.println(s);

        String y = "Bom dia X" //POde continuar na mesma linha ou descer como feito aqui.
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        //Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}