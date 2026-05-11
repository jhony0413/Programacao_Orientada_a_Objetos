import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf(
                "Digite as notas 1, 2 e 3 e depois seus respectivos pesos consecutivamente (exemplo: 10, 7, 8, 1, 2, 3): \n");

        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        float peso1 = entrada.nextFloat();
        float peso2 = entrada.nextFloat();
        float peso3 = entrada.nextFloat();

        System.out.printf("A media ponderada das 3 notas apresentadas eh: %.2f",
                ((nota1 * peso1) + (nota2 * peso2) + (nota3 * nota3)) / (peso1 + peso2 + peso3));
    }
}
