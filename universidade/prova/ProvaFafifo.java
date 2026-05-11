package universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {
    public ProvaFafifo(double av1, double av2) {
        super(av1, av2);
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;
        this.mediaMinima = 6;
    }

    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) {
            return (av1 + av2) / 2;
        }
        return ((av1 * pesoAv1) + (av2 * pesoAv2) + (av3 * pesoAv3)) / (pesoAv1 + pesoAv2 + pesoAv3);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(double notaFinal) {
        if (aprovado()) {
            System.out.println("Aluno já aprovado.");
            return null;
        }
        if (realizouProvaFinal) {
            System.out.println("Prova final já realizada.");
            return null;
        }
        realizouProvaFinal = true;
        return new ProvaFinalFafifo(this, notaFinal);
    }
}
