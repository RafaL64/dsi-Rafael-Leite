package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Insira a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Valor recebido por hora: ");
        int valorPorHora = scanner.nextInt();

        System.out.println("Tempo de trabalho (Em anos): ");
        int tempoTrabalho = scanner.nextInt();

        System.out.println("Valor do Salário família por filho: ");
        int valorPorFilho = scanner.nextInt();

        System.out.println("Quantidade de filhos com a idade inferior a 14 anos: ");
        int filhos = scanner.nextInt();

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
        System.out.println("Salário bruto: " + salarioBruto + " R$");
        System.out.println("INPS: " + inps + " R$");
        System.out.println("Imposto de renda: " + ir + " R$");
        System.out.println("Total de descontos: " + totalDescontos + " R$");
        System.out.println("Adicional: " + adicional + " R$");
        System.out.println("Sálario líquido: " + salarioLiquido + " R$");
        scanner.close();
    }
}