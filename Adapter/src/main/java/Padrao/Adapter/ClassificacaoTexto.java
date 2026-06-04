package Padrao.Adapter;

public class ClassificacaoTexto implements IClassificacao {

    private String classificacao;

    @Override
    public String getClassificacao() {
        return classificacao;
    }

    @Override
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
