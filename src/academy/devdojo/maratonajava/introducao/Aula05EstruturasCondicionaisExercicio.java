package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu sálario: R$ ");
        double salarioAnual = sc.nextDouble();
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorTaxa;

        if (salarioAnual <= 34712) {
            valorTaxa = salarioAnual * taxa1;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorTaxa = salarioAnual * taxa2;
        } else {
            valorTaxa = salarioAnual * taxa3;
        }
        System.out.println(valorTaxa);

    }
}
