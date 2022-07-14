package Objeto.orientacao;

import Objeto.orientacao.Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Informe o valor da largura: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Informe o valor da altura: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("A área e %.2f%n", rectangle.area());
        System.out.printf("O perímetro e: %.2f%n", rectangle.perimeter());
        System.out.printf("A diagonal e: %.2f%n", rectangle.diagonal());

    }
}
