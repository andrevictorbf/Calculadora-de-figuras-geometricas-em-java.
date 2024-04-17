package programa;

import entities.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Calculadora de figuras geometricas: circulo, triangulo e retangulo.");
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Calcular círculo");
            System.out.println("2. Calcular triângulo");
            System.out.println("3. Calcular retângulo");
            System.out.println("4. Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Circulo circulo;
                    circulo = new Circulo();
                    System.out.println("Insira o raio do circulo: ");
                    circulo.setRaioCirculo(input.nextDouble());
                    System.out.printf("Area: %.2f\n", circulo.areaCirculo());
                    System.out.printf("Perimeter: %.2f\n", circulo.comprimentoCirculo());
                    break;

                case 2:
                    Triangulo triangulo;
                    triangulo = new Triangulo();
                    System.out.println("Insira os lados do retangulo: ");
                    triangulo.setLadoA(input.nextDouble());
                    triangulo.setLadoB(input.nextDouble());
                    triangulo.setLadoC(input.nextDouble());
                    System.out.printf("Area: %.2f\n", triangulo.areaTriangulo());
                    triangulo.tipoTriangulo();

                    break;

                case 3:
                    Retangulo retangulo;
                    retangulo = new Retangulo();

                    System.out.println("Insira a base e a altura do retangulo: ");

                    retangulo.setLargura(input.nextDouble());
                    retangulo.setAltura(input.nextDouble());
                    System.out.println();
                    System.out.printf("Area: %.2f\n", retangulo.areaRet());
                    System.out.printf("Perimeter: %.2f\n", retangulo.perimeterRet());
                    System.out.printf("Diagonal: %.2f\n", retangulo.diagonalRet());

                    break;
                case 4:
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("Digite uma opcao valida.");
                    break;
            }

        }
        input.close();
    }
}
