import java.util.Scanner;

public class Ex1 {

    /*
     * Método "soma" desnecessário criado apenas para fins de aprendizado. Seria
     * melhor apenas somar tudo dentro dos argumentos de System.out.printf().
     */
    public static float soma(float a, float b, float c, float d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite quatro numeros inteiros para soma-los: \n");

        float a = entrada.nextFloat();
        float b = entrada.nextFloat();
        float c = entrada.nextFloat();
        float d = entrada.nextFloat();

        float resultado = Ex1.soma(a, b, c, d);

        System.out.printf("%.2f", resultado);
    }
}
