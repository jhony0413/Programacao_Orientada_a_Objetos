package universidade.prova;

public abstract class ProvaFinalUniversidade {
    protected double notaProvaFinal, pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade, double av3) {
        this.provaUniversidade = provaUniversidade;
        this.notaProvaFinal = av3;
        provaUniversidade.av3 = av3;
        this.realizouProva = true;
    }

    public abstract boolean habilitadoRealizarProva();
}
