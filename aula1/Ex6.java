import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o valor do seu salario base: \n");

        float salario = entrada.nextFloat();

        System.out.printf(
                "Sabendo que:\nseu salario base eh %.2f;\nsua gratificacao eh de 5%%;\nseu imposto a pagar eh de 7%%.\n\nSeu salario a receber eh: %.2f",
                salario, 0.98 * salario);
    }
}
