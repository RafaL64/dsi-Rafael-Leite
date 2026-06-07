package exercicios;

import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo do funcionario: ");
        int codigo = scanner.nextInt();

        System.out.print("Quanto tempo o funcionario trabalha na empresa (em anos): ");
        int temp_trabalho = scanner.nextInt();

        System.out.print("Insira o sexo do funionario (F) (M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        double bonus = 0;

        // Calculadora de bonus masculino
        if (sexo == 'M') {
            if (temp_trabalho > 15) {
                bonus = salario * 0.20;
            } else {
                bonus = 100;
            }
        }

        // Calculadora de bonus feminino
        if (sexo == 'F') {
            if (temp_trabalho > 10) {
                bonus = salario * 0.25;
            } else {
                bonus = 100;
            }
        }

        System.out.println("seu bonus e de: " + bonus + " R$");

        scanner.close();
    }
}
