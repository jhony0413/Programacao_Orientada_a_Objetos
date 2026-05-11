package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double av1, double av2) {
        super(av1, av2);
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) {
            return (av1 + av2) / 2;
        }
        double menor;
        if (av1 <= av2 && av1 <= av3) {
            menor = av1;
        } else if (av2 <= av1 && av2 <= av3) {
            menor = av2;
        } else {
            menor = av3;
        }
        return (av1 + av2 + av3 - menor) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(double notaFinal) {
        if (realizouProvaFinal) {
            System.out.println("AV3 já realizada.");
            return null;
        }
        realizouProvaFinal = true;
        return new ProvaAV3UCB(this, notaFinal);
    }
}
