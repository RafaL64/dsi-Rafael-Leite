
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo, tempoDeTrabalho;
        double salario;
        char genero;
        double bonus = 0;

        // Verifica se o código do funcionário é valido, só pode ser número inteiro e
        // positivo
        while (true) {
            System.out.print("Código do funcionário: ");
            if (scanner.hasNextInt()) {
                codigo = scanner.nextInt();
                if (codigo >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            System.out.println("Valor Inválido, tente novamente.");
            scanner.nextLine();
        }

        // Verifica o tempo de trabalho do funcionário em anos
        while (true) {
            System.out.print("Quanto tempo o funcionário trabalha na empresa (em anos): ");
            if (scanner.hasNextInt()) {
                tempoDeTrabalho = scanner.nextInt();
                if (tempoDeTrabalho >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            System.out.println("Valor Inválido, tente novamente.");
            scanner.nextLine();
        }

        // Verifica o gênero do funcionario, se é Masculino(M) ou Feminino(F)
        while (true) {
            System.out.println("Digite o gênero do funcionário (F) (M): ");
            genero = scanner.next().toUpperCase().charAt(0);
            if (genero == 'M' || genero == 'F') {
                break;
            }
            System.out.println("Valor Inválido, tente novamente.");
        }

        System.out.print("Digite o salario do funcionario: ");
        salario = scanner.nextDouble();

        // Calculadora de bonus masculino
        if (genero == 'M') {
            if (tempoDeTrabalho > 15) {
                bonus = salario * 0.20;
            } else {
                bonus = 100;
            }
        }

        // Calculadora de bonus feminino
        if (genero == 'F') {
            if (tempoDeTrabalho > 10) {
                bonus = salario * 0.25;
            } else {
                bonus = 100;
            }
        }

        System.out.println("Funcionário de código " + codigo + ", seu bônus é de: R$" + bonus);

        scanner.close();
    }
}
