package br.com.nfe.xml.retorno.vo;

import javax.xml.bind.annotation.XmlElement;

public class Situacao {

    private String codigo;
    private String descricao;

    public Situacao() {
        super();
    }

    public Situacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @XmlElement(name = "CODIGO")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlElement(name = "DESCRICAO")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
