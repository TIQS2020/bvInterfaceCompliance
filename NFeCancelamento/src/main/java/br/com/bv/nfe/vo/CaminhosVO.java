package br.com.bv.nfe.vo;

public class CaminhosVO {

    private String recebido;
    private String processando;
    private String finalizado;

    public CaminhosVO() {
        super();
    }

    public CaminhosVO(String recebido, String processando, String finalizado) {
        this.recebido = recebido;
        this.processando = processando;
        this.finalizado = finalizado;
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
}
