package br.com.nfe.xml.retorno.vo;

public class CaminhosVO {

    private String recebido;
    private String processando;
    private String finalizado;
    private String erro;

    public CaminhosVO() {
        super();
    }

    public CaminhosVO(String recebido, String processando, String finalizado, String erro) {
        this.recebido = recebido;
        this.processando = processando;
        this.finalizado = finalizado;
        this.erro = erro;
    }

    public String getRecebido() {
        return recebido;
    }

    public void setRecebido(String recebido) {
        this.recebido = recebido;
    }

    public String getProcessando() {
        return processando;
    }

    public void setProcessando(String processando) {
        this.processando = processando;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
