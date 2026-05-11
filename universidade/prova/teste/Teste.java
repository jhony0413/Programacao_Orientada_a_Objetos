package universidade.prova.teste;

import universidade.prova.*;

public class Teste {
    public static void main(String[] args) {
        System.out.println("----------UCB----------");
        System.out.println("Nota AV1: 6 | Peso AV1: 1\nNota AV2: 7 | Peso AV2: 1");
        ProvaUCB ucb = new ProvaUCB(6, 7);
        System.out.println("Média inicial: " + ucb.calcularMedia());
        System.out.println("Aprovado: " + ucb.aprovado());
        System.out.println("Nota AV3: 8 | Peso AV3: 1");
        ucb.getProvaFinalUniversidade(8);
        System.out.println("Média após AV3: " + ucb.calcularMedia());
        System.out.println("Aprovado: " + ucb.aprovado());

        System.out.println("--------FAFIFO---------");
        System.out.println("Nota AV1: 5 | Peso AV1: 1\nNota AV2: 6 | Peso AV2: 1");
        ProvaFafifo fafifo = new ProvaFafifo(5, 6);
        System.out.println("Média inicial: " + fafifo.calcularMedia());
        System.out.println("Aprovado: " + fafifo.aprovado());

        if (!fafifo.aprovado()) {
            System.out.println("Nota AV3: 7 | Peso AV3: 3");
            fafifo.getProvaFinalUniversidade(7);
            System.out.println("Média após final: " + fafifo.calcularMedia());
            System.out.println("Aprovado: " + fafifo.aprovado());
        }
    }
}
