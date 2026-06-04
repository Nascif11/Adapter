package Padrao.Adapter;

public class ClassificacaoAdapter extends ClassificacaoPontuacao {

    private IClassificacao classificacaoTexto;

    public ClassificacaoAdapter(IClassificacao classificacaoTexto) {
        this.classificacaoTexto = classificacaoTexto;
    }

    public String recuperarClassificacao() {

        if (this.getPontuacao() >= 10) {
            classificacaoTexto.setClassificacao("Premium");
        }
        else if (this.getPontuacao() >= 7) {
            classificacaoTexto.setClassificacao("Intermediário");
        }
        else {
            classificacaoTexto.setClassificacao("Básico");
        }

        return classificacaoTexto.getClassificacao();
    }

    public void salvarClassificacao() {

        if (classificacaoTexto.getClassificacao().equals("Premium")) {
            this.setPontuacao(10);
        }
        else if (classificacaoTexto.getClassificacao().equals("Intermediário")) {
            this.setPontuacao(7);
        }
        else {
            this.setPontuacao(5);
        }
    }
}