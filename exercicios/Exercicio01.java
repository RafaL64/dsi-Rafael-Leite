import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade, horasTrabalhadas, tempoTrabalho, filhos;
        double valorPorHora, valorPorFilho;

        System.out.println("Insira o nome do funcionário: ");
        String nome = scanner.nextLine();

        // Verifica a idade do funcionário
        while (true) {
            System.out.println("Insira a idade do funcionário: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verifica as horas trabalhadas
        while (true) {
            System.out.println("Insira a quantidade de horas trabalhadas: ");
            if (scanner.hasNextInt()) {
                horasTrabalhadas = scanner.nextInt();
                if (horasTrabalhadas >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verifica o valor que o funcionario recebe por hora
        while (true) {
            System.out.println("Valor recebido por hora: ");
            if (scanner.hasNextDouble()) {
                valorPorHora = scanner.nextDouble();
                if (valorPorHora >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verifica o tempo que o funcionário trabalha em anos
        while (true) {
            System.out.println("Tempo de trabalho (Em anos): ");
            if (scanner.hasNextInt()) {
                tempoTrabalho = scanner.nextInt();
                if (tempoTrabalho > 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // verifica o salario medio da familia
        while (true) {
            System.out.println("Valor do Salário família por filho: ");
            if (scanner.hasNextInt()) {
                valorPorFilho = scanner.nextDouble();
                if (valorPorFilho >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }

        // Verifica a quantidade de filhos < 14 anos
        while (true) {
            System.out.println("Quantidade de filhos com a idade inferior a 14 anos: ");
            if (scanner.hasNextInt()) {
                filhos = scanner.nextInt();
                if (filhos >= 0) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Valor inválido, tente novamente.");
        }
        double salarioBruto = (horasTrabalhadas * valorPorHora);
        double inps = (salarioBruto * 0.085);
        double salarioFamilia = (valorPorFilho * filhos);
        double ir = 0;

        // Calculo do imposto de renda
        if (salarioBruto > 1500) {
            ir = (0.15 * salarioBruto);
        } else if (salarioBruto < 1500 && salarioBruto > 500) {
            ir = (0.08 * salarioBruto);
        } else if (salarioBruto <= 500) {
            ir = 0;
        }

        // Calculo do adicional
        double adicional = 0;
        if (idade > 40) {
            adicional = (salarioBruto * 0.02);
        } else if (tempoTrabalho > 15) {
            adicional = (salarioBruto * 0.035);
        } else if ((tempoTrabalho <= 15 && tempoTrabalho > 5) && idade > 30) {
            adicional = (salarioBruto * 0.015);
        }

        // Calculo do salário líquido
        double totalDescontos = (inps + ir);
        double salarioLiquido = (salarioBruto - totalDescontos + salarioFamilia + adicional);

        System.out.println("\n-------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("INPS: R$" + inps);
        System.out.println("Imposto de renda: R$" + ir);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Adicional: R$" + adicional);
        System.out.println("Sálario líquido: R$" + salarioLiquido);
        scanner.close();
    }
}