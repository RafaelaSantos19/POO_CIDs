import java.util.ArrayList;

public class CategoriaCID implements Pesquisavel {
    private String nome;
    private ArrayList<Doenca> doencas;

    public CategoriaCID(String nome) {
        this.nome = nome;
        this.doencas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDoenca(Doenca doenca) {
        this.doencas.add(doenca);
    }

    public ArrayList<Doenca> getDoencas() {
        return doencas;
    }

    @Override
    public String toString() {
        return "CategoriaCID [nome=" + nome + ", número de doenças=" + doencas.size() + "]";
    }

    @Override
    public boolean pesquisarPorCodigo(String codigo) {
        for (Doenca doenca : doencas) {
            if (doenca.pesquisarPorCodigo(codigo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean pesquisarPorNome(String nome) {
        for (Doenca doenca : doencas) {
            if (doenca.pesquisarPorNome(nome)) {
                return true;
            }
        }
        return false;
    }
}
