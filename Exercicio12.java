import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float n1 = entrada.nextInt();
        System.out.println("Elevado ao quadrado: " + Math.pow(n1, 2));
        System.out.println("Elevado ao cubo: " + Math.pow(n1, 3));
        System.out.println("Raiz quadrada: " + Math.sqrt(n1));
        System.out.println("Elevado à 10: " + Math.pow(n1, 10));
    }
}
