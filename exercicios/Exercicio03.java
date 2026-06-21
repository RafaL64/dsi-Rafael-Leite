
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, ladoC;

        System.out.println("Digite as medidas dos triangulo em ordem do maior pro menor");

        // Verificando o lado A
        while (true) {
            System.out.println("Valor do lado A do triângulo: ");
            if (scanner.hasNextDouble()) {
                ladoA = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verificando o lado B
        while (true) {
            System.out.println("Valor do lado B do triângulo: ");
            if (scanner.hasNextDouble()) {
                ladoB = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verificando o lado C
        while (true) {
            System.out.println("Valor do lado C do triângulo: ");
            if (scanner.hasNextDouble()) {
                ladoC = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }
        int expo = 2;

        if (ladoA > ladoB + ladoC) {
            System.out.println("Nao formam triângulo algum");
        }

        // Verificação de ângulos
        if (Math.pow(ladoA, expo) == Math.pow(ladoB, expo) + Math.pow(ladoC, expo)) {
            System.out.println("Formam um triângulo retangulo");
        } else if (Math.pow(ladoA, expo) > Math.pow(ladoB, expo) + Math.pow(ladoC, expo)) {
            System.out.println("Formam um triângulo obtusangulo");
        } else if (Math.pow(ladoA, expo) < Math.pow(ladoB, expo) + Math.pow(ladoC, expo)) {
            System.out.println("Formam um triângulo acutângulo");

        }
        // Verificação de lados
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Fotmam um triângulo equilatero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Formam um triângulo isóceles");
        }
        scanner.close();
    }
}