import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();
        
        double maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }
        
        double menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        
        double media = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética dos números é: " + media);
        
        entrada.close();
    }
}
