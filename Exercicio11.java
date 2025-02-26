import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o ano atual: ");
        int n2 = entrada.nextInt();
        int n3 = n2 - n1;
        System.out.println("Sua idade é: " + n3 + " anos");
        System.out.println("Em 2030 você terá: " + (2030 - n1));
    }
}