public public abstract class Doenca implements Pesquisavel {
    private String codigo;
    private String descricao;

    public Doenca(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Doenca [codigo=" + codigo + ", descricao=" + descricao + "]";
    }

    @Override
    public boolean pesquisarPorCodigo(String codigo) {
        return this.codigo.equalsIgnoreCase(codigo);
    }

    @Override
    public boolean pesquisarPorNome(String nome) {
        return this.descricao.equalsIgnoreCase(nome);
    }
}
 Doenca {
    
}
