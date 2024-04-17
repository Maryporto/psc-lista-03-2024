import java.util.Scanner;

public class areacirculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código da operaç?o (1 - Perímetro do círculo, 2 - Área do círculo, 3 - Volume da esfera):");
        int codigoOperacao = entrada.nextInt();

        System.out.print("Digite o raio:");
        double raio = entrada.nextDouble();

        switch (codigoOperacao) {
            case 1:
                calcularPerimetroCirculo(raio);
                break;
            case 2:
                calcularAreaCirculo(raio);
                break;
            case 3:
                calcularVolumeEsfera(raio);
                break;
            default:
                System.out.println("Erro: Código de operaç?o inválido.");
        }

        entrada.close();
    }

    public static void calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Perímetro do círculo: " + perimetro);
    }

    public static void calcularAreaCirculo(double raio) {
        double area = Math.PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }

    public static void calcularVolumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + volume);
    }
}
