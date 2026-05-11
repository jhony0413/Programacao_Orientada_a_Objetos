package universidade.prova;

public abstract class ProvaUniversidade {
    protected double av1, av2, av3, pesoAv1, pesoAv2, pesoAv3, mediaMinima;
    protected boolean realizouProvaFinal;

    public ProvaUniversidade(double av1, double av2) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = 0;
        this.pesoAv3 = 0;
        this.realizouProvaFinal = false;
    }

    public abstract double calcularMedia();

    public abstract ProvaFinalUniversidade getProvaFinalUniversidade(double notaFinal);

    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }
}
