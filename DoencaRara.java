public class DoencaRara extends Doenca {
    private double incidencia;

    public DoencaRara(String codigo, String descricao, double incidencia) {
        super(codigo, descricao);
        this.incidencia = incidencia;
    }

    public double getIncidencia() {
        return incidencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Incidencia: " + incidencia + "%";
    }
}
