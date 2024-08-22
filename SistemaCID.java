import java.util.ArrayList;

public class SistemaCID {
    private ArrayList<CategoriaCID> categorias;

    public SistemaCID() {
        this.categorias = new ArrayList<>();
    }

    public void adicionarCategoria(CategoriaCID categoria) {
        this.categorias.add(categoria);
    }

    public CategoriaCID pesquisarCategoriaPorNome(String nome) {
        for (CategoriaCID categoria : categorias) {
            if (categoria.getNome().equalsIgnoreCase(nome)) {
                return categoria;
            }
        }
        return null;
    }

    public Doenca pesquisarDoencaPorCodigo(String codigo) {
        for (CategoriaCID categoria : categorias) {
            for (Doenca doenca : categoria.getDoencas()) {
                if (doenca.pesquisarPorCodigo(codigo)) {
                    return doenca;
                }
            }
        }
        return null;
    }
}
