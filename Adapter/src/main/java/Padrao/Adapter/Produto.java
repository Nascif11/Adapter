package Padrao.Adapter;

public class Produto {

    IClassificacao classificacao;
    ClassificacaoAdapter persistencia;

    public Produto() {

        classificacao = new ClassificacaoTexto();
        persistencia = new ClassificacaoAdapter(classificacao);
    }

    public void setClassificacao(String classificacao) {

        this.classificacao.setClassificacao(classificacao);

        persistencia.salvarClassificacao();
    }

    public String getClassificacao() {
        return persistencia.recuperarClassificacao();
    }

    public int getPontuacao() {
        return persistencia.getPontuacao();
    }
}
