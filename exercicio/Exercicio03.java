import java.util.Scanner;

public class Exercicio03 { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as medidas dos triangulo em ordem do maior pro menor");
        System.out.print("Valor do lado A do triangulo: ");
            int lado_a = scanner.nextInt();
        System.out.print("Valor do lado B do triangulo: ");
            int lado_b = scanner.nextInt();
        System.out.print("Valor do lado C do triangulo: ");
            int lado_c = scanner.nextInt();
        int expo = 2;

        if(lado_a > lado_b + lado_c){
            System.out.println("Nao formam triangulo algum");
        }

        else if (Math.pow(lado_a, expo) == Math.pow(lado_b, expo) + Math.pow(lado_c, expo)){
            System.out.println("Formam um triangulo retangulo");
        }

        else if (Math.pow(lado_a, expo) > Math.pow(lado_b, expo) + Math.pow(lado_c, expo)){
            System.out.println("Formam um triangulo obtusangulo");
        }

        else if (Math.pow(lado_a, expo) < Math.pow(lado_b, expo) + Math.pow(lado_c, expo)){
            System.out.println("Formam um triangulo acutangulo");
        }


        


        
    
        scanner.close();
    }
}