package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {
    public ProvaAV3UCB(ProvaUniversidade provaUniversidade, double av3) {
        super(provaUniversidade, av3);
        this.pesoProvaFinal = 1;
        this.provaUniversidade.pesoAv3 = 1;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return !provaUniversidade.realizouProvaFinal;
    }
}
