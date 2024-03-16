package Exercicio_JAVA;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("------------------");

        System.out.print("Informe o sexo (M/F): ");
        scanner.nextLine();

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        System.out.println("\nResultado para " + nome);
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau I";
        } else if (imc < 40) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}
