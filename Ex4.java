import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o valor do seu salario atual para calcular seu aumento em 25%%: \n");

        float salario = entrada.nextFloat();

        System.out.printf("25%% de seu salario eh: %.2f\nSeu novo salario eh: %.2f\n", 0.25 * salario, 1.25 * salario);
    }
}