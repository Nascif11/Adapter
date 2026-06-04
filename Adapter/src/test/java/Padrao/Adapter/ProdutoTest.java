package Padrao.Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveArmazenarPremiumComoPontuacao10() {

        Produto produto = new Produto();

        produto.setClassificacao("Premium");

        assertEquals(10, produto.getPontuacao());
    }

    @Test
    void deveArmazenarIntermediarioComoPontuacao7() {

        Produto produto = new Produto();

        produto.setClassificacao("Intermediário");

        assertEquals(7, produto.getPontuacao());
    }

    @Test
    void deveRetornarClassificacaoPremium() {

        Produto produto = new Produto();

        produto.setClassificacao("Premium");

        assertEquals("Premium", produto.getClassificacao());
    }

    @Test
    void deveRetornarClassificacaoBasico() {

        Produto produto = new Produto();

        produto.setClassificacao("Básico");

        assertEquals("Básico", produto.getClassificacao());
    }
}