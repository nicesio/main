package com.example.nicesio.apprevisao;

/**
 * Created by Nicesio on 15/09/2017.
 */

public class ListadeCompras {

    private String produto;
    private String quantidade;
    private String categoria;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ListadeCompras(String produto, String quantidade, String categoria) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.categoria = categoria;

    }
}
