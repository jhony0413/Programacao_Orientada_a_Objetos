import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf(
                "Digite o valor do seu salario atual e o valor em porcentagem de seu aumento (nao digite o simbolo de porcentagem, apenas o valor. Exemplo: 50%% = 50): \n");

        float salario = entrada.nextFloat();
        float aumento = entrada.nextFloat();

        System.out.printf("%.2f%% de seu salario eh: %.2f\nSeu novo salario eh: %.2f\n", aumento,
                (aumento / 100) * salario, (aumento / 100 + 1) * salario);
    }
}