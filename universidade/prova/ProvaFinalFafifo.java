package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {
    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade, double av3) {
        super(provaUniversidade, av3);
        this.pesoProvaFinal = 3;
        this.provaUniversidade.pesoAv3 = 3;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return !provaUniversidade.aprovado() && !provaUniversidade.realizouProvaFinal;
    }
}
