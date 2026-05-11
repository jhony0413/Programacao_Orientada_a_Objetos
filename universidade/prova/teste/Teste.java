package universidade.prova.teste;

import universidade.prova.*;

public class Teste {
    public static void main(String[] args) {
        System.out.println("----------UCB----------");
        ProvaUCB ucb = new ProvaUCB(6, 7);
        System.out.println("Média inicial: " + ucb.calcularMedia());
        System.out.println("Aprovado: " + ucb.aprovado());
        ucb.getProvaFinalUniversidade(8);
        System.out.println("Média após AV3: " + ucb.calcularMedia());
        System.out.println("Aprovado: " + ucb.aprovado());

        System.out.println("--------FAFIFO---------");
        ProvaFafifo fafifo = new ProvaFafifo(7, 9);
        System.out.println("Média inicial: " + fafifo.calcularMedia());
        System.out.println("Aprovado: " + fafifo.aprovado());

        if (!fafifo.aprovado()) {
            fafifo.getProvaFinalUniversidade(7);
            System.out.println("Média após final: " + fafifo.calcularMedia());
            System.out.println("Aprovado: " + fafifo.aprovado());
        }
    }
}
