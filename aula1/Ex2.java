import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite as notas 1, 2 e 3 consecutivamente dando um enter para cada valor separadamente: \n");

        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();

        System.out.printf("A media aritmetica das 3 notas apresentadas eh: %.2f", (nota1 + nota2 + nota3) / 3);
    }
}
