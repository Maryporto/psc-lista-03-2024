import java.util.Scanner;
import java.util.Random;

public class sorteN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();
        
        int menorNumero, maiorNumero;
        
        if (numero1 < numero2) {
            menorNumero = numero1;
            maiorNumero = numero2;
        } else {
            menorNumero = numero2;
            maiorNumero = numero1;
        }
        
        Random random = new Random();
        int numeroSorteado = random.nextInt(maiorNumero - menorNumero + 1) + menorNumero;
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        entrada.close();
    }
}
