import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int n2 = entrada.nextInt();
        System.out.println("O produto é : " + n1*n2);
        entrada.close();
    }
}