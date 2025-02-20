import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero inteiro: ");
        int n3 = entrada.nextInt();
        System.out.println("Digite o quarto numero inteiro: ");
        int n4 = entrada.nextInt();
        int soma = n1+n2+n3+n4;
        System.out.println("A soma entre esses quatro numeros inteiros é: " +soma);
    }
}